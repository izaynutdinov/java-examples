package net.iskandar.for_binadox.chat.client.model;

import java.util.List;

import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;

import net.iskandar.for_binadox.chat.client.log.Logger;
import net.iskandar.for_binadox.chat.client.to.ChatMessageTo;
import net.iskandar.for_binadox.chat.client.mvp.ClientFactory;

public class PollingChatModelImpl extends BaseChatModelImpl {

	private Timer updateMessagesTimer;
	private static final Logger log = new Logger("PollingChatModelImpl");

	public PollingChatModelImpl(ClientFactory clientFactory){
		super(clientFactory);
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
		/*chatFacade.updateChatMessages(new Integer[]{ getChatId() }, getLastMessageId(), new AsyncCallback<List<ChatMessageTo>>() {
			@Override
			public void onSuccess(List<ChatMessageTo> result) {
				onNewMessages(result);
			}

			@Override
			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
			}
		});*/
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
