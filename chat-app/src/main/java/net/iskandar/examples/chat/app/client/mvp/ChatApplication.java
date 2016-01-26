package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.ChatFacadeAsync;
import net.iskandar.examples.chat.app.client.mvp.views.ViewFactory;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

public interface ChatApplication {
	ChatFacadeAsync getChatFacade();
	ViewFactory getViewFactory();
	ChatMessageRenderer getChatMessageRenderer();
	Integer getDefaultChatId();
	void setDefaultChatId(Integer defaultChatId);
	void setChatMessageRenderer(ChatMessageRenderer chatMessageRederer);
	void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory);
}
