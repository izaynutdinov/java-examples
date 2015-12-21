package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.ChatFacadeAsync;
import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;
import net.iskandar.examples.chat.app.client.mvp.views.ViewFactory;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;

public interface ChatApplication {
	ChatView getChatView();
	ChatFacadeAsync getChatFacade();
	EventBus getEventBus();
	PlaceController getPlaceController();
	ChatModel getChatModel();
	ViewFactory getViewFactory();
	ChatMessageRenderer getChatMessageRenderer();
	Integer getDefaultChatId();
	void setDefaultChatId(Integer defaultChatId);	
	void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory);
	void setChatMessageRenderer(ChatMessageRenderer chatMessageRederer);
}
