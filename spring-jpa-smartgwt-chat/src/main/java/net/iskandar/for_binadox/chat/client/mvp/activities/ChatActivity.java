package net.iskandar.for_binadox.chat.client.mvp.activities;

import net.iskandar.for_binadox.chat.client.mvp.ClientFactory;
import net.iskandar.for_binadox.chat.client.mvp.places.ChatPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ChatActivity implements Activity {

	private ClientFactory clientFactory;
	private ChatPlace place;

	public ChatActivity(ChatPlace place, ClientFactory clientFactory) {
		super();
		this.clientFactory = clientFactory;
		this.place = place;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		String chatIdStr = place.getChatId();
		try {
			Integer chatId = Integer.parseInt(chatIdStr);
			panel.setWidget(clientFactory.chatPanel());			
			clientFactory.chatPanel().setVisible(true);
			clientFactory.chatPanel().setChatId(chatId);
		} catch(NumberFormatException nfe){
			;
		}
	}

	@Override
	public String mayStop() {
		return null;
	}

	@Override
	public void onCancel() {
		// TODO Auto-generated method stub
	}

	@Override
	public void onStop() {
		// TODO Auto-generated method stub
	}

}
