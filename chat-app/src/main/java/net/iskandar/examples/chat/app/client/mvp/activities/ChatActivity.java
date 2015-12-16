package net.iskandar.examples.chat.app.client.mvp.activities;

import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.mvp.places.ChatPlace;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ChatActivity implements Activity {

	private ChatApplication chatApplication;
	private ChatPlace place;

	public ChatActivity(ChatPlace place, ChatApplication chatApplication) {
		super();
		this.chatApplication = chatApplication;
		this.place = place;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		String chatIdStr = place.getChatId();
		try {
			Integer chatId = Integer.parseInt(chatIdStr);
			ChatView chatView = chatApplication.getChatView();
			chatView.asWidget().setVisible(true);
			panel.setWidget(chatView);
			chatView.setChatId(chatId);
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
