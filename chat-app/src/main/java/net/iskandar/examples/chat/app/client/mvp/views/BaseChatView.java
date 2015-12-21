package net.iskandar.examples.chat.app.client.mvp.views;

import net.iskandar.examples.chat.app.client.mvp.presenters.ChatPresenter;

import com.google.gwt.user.client.ui.Widget;

public abstract class BaseChatView implements ChatView {

	protected ChatPresenter presenter;
	
	@Override
	public void setChatPresenter(ChatPresenter chatPresenter) {
		presenter = chatPresenter;
	}

}
