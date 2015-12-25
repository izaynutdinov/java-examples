package net.iskandar.examples.chat.app.client.mvp.model;

import java.util.ArrayList;
import java.util.List;

import net.iskandar.examples.chat.app.client.ChatFacadeAsync;
import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.ChatApplicationInternal;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.ChatMessagesTo;

import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class BaseChatModelImpl implements ChatModel {

	private static final Logger log = new Logger(BaseChatModelImpl.class.getSimpleName());

	protected final ChatFacadeAsync chatFacade;
	private Integer chatId;
	private Integer lastMessageId = -1;
	private int daysMessages;
	private List<Listener> listeners = new ArrayList<Listener>();
	
	public BaseChatModelImpl(ChatApplicationInternal chatApplication) {
		super();
		this.chatFacade = chatApplication.getChatFacade();
	}

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
		setLastMessageId(-1);
	}

	public Integer getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(Integer lastMessageId) {
		this.lastMessageId = lastMessageId;
	}

	public int getDaysMessages() {
		return daysMessages;
	}

	public void setDaysMessages(int daysMessages) {
		this.daysMessages = daysMessages;
	}

	@Override
	public void addListener(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void removeListener(Listener listener) {
		listeners.remove(listener);
	}

	protected void onNewMessages(List<ChatMessageTo> messages){
		List<ChatMessageTo> messagesToEmit = new ArrayList<ChatMessageTo>();
		for(ChatMessageTo message : messages){
			if(lastMessageId < message.getId()){
				lastMessageId = message.getId();
				messagesToEmit.add(message);
			}
		}
		for(Listener l : listeners)
			l.newMessages(this, messagesToEmit);			
	}

	@Override
	public void init(Integer chatId, int daysMessages) {
		setChatId(chatId);
		setDaysMessages(daysMessages);
		doBeforeInit();
		log.log("About to call getChatMessages chatId = " + getChatId() 
				+ ", daysMessages = " + getDaysMessages());
		chatFacade.getChatMessages(getChatId(), getDaysMessages(), new AsyncCallback<ChatMessagesTo>() {

			@Override
			public void onSuccess(ChatMessagesTo result) {
				onNewMessages(result.getMessages());
				if(result.getMessages().isEmpty())
					setLastMessageId(result.getLastMessageId());
				doAfterInit();
			}

			@Override
			public void onFailure(Throwable caught) {
				
			}

		});
	}
	
	@Override
	public void postMessage(String text) {
		chatFacade.postMessage(getChatId(), text, new AsyncCallback<Void>() {
			@Override
			public void onFailure(Throwable caught) {
				log.log("postMessage.onFailure");
				log.log("message: " + caught.getMessage());
			}

			@Override
			public void onSuccess(Void result) {
				log.log("postMessage.onSuccess");				
				doAfterPostMessage();
			}
		});
	}

	protected abstract void doBeforeInit();
	protected abstract void doAfterInit();
	protected abstract void doBeforePostMessage();
	protected abstract void doAfterPostMessage();

}
