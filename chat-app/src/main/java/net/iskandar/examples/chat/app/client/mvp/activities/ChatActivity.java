package net.iskandar.examples.chat.app.client.mvp.activities;

import java.util.List;

import net.iskandar.examples.chat.app.client.ChatFacadeException;
import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.mvp.ChatMessageRenderer;
import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.places.ChatPlace;
import net.iskandar.examples.chat.app.client.mvp.presenters.ChatPresenter;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public class ChatActivity implements Activity, ChatPresenter, ChatModel.Listener {

	private ChatApplication chatApplication;
	private ChatPlace place;
	private ChatModel chatModel;
	private ChatView chatView;

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
			chatView = chatApplication.getChatView();
			chatView.clearMessages();
			chatView.asWidget().setVisible(true);
			panel.setWidget(chatView);
			chatView.setChatPresenter(this);
			chatModel = chatApplication.getChatModel();
			chatModel.addListener(this);
			chatModel.init(chatId, 0);			
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
		chatModel.removeListener(this);
	}

	@Override
	public void chatError(ChatFacadeException error) {
		// TODO Auto-generated method stub
	}

	@Override
	public void newMessages(ChatModel sender, List<ChatMessageTo> messages) {
		ChatMessageRenderer renderer = chatApplication.getChatMessageRenderer();
		for(ChatMessageTo chatMessage : messages)
			chatApplication.getChatView().addMessage(renderer.renderChatMessage(chatMessage));
	}

	@Override
	public void postMessage(String message) {
		chatModel.postMessage(message);
	}

}
