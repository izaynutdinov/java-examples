package net.iskandar.examples.chat.app.client.mvp.model;

import java.util.List;

import net.iskandar.examples.chat.app.client.log.Logger;
import net.iskandar.examples.chat.app.client.mvp.ChatApplicationInternal;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class PollingChatModelImpl extends BaseChatModelImpl {

	private Timer updateMessagesTimer;
	private static final Logger log = new Logger("PollingChatModelImpl");

	public PollingChatModelImpl(ChatApplicationInternal chatApplication){
		super(chatApplication);
	}

	@Override
	protected void doBeforeInit(){
		if(updateMessagesTimer != null){
			if(updateMessagesTimer.isRunning())
				updateMessagesTimer.cancel();
			updateMessagesTimer = null;
		}
	}

	@Override
	protected void doAfterInit() {
		updateMessagesTimer = new Timer(){
			@Override
			public void run() {
				updateMessages();
			}
		};
		updateMessagesTimer.schedule(1000);		
	}

	protected void updateMessages(){
		chatFacade.updateChatMessages(new Integer[]{ getChatId() }, getLastMessageId(), new AsyncCallback<List<ChatMessageTo>>() {
			@Override
			public void onSuccess(List<ChatMessageTo> result) {
				onNewMessages(result);
			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
			}
		});
		updateMessagesTimer.schedule(1000);
	}

	private native int getTimeZoneOffset()/*-{
    	return new Date().getTimezoneOffset();
	}-*/;

	@Override
	protected void doBeforePostMessage(){
		if(updateMessagesTimer != null && updateMessagesTimer.isRunning())
			updateMessagesTimer.cancel();
	}

	@Override
	protected void doAfterPostMessage(){
		updateMessages();
	}

}
