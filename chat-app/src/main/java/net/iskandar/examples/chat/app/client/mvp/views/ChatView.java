package net.iskandar.examples.chat.app.client.mvp.views;

import net.iskandar.examples.chat.app.client.mvp.presenters.ChatPresenter;
import com.google.gwt.user.client.ui.IsWidget;

public interface ChatView extends IsWidget {
	void setChatPresenter(ChatPresenter chatPresenter);
	void clearMessages();
	void addMessage(String messageHtml);
}
