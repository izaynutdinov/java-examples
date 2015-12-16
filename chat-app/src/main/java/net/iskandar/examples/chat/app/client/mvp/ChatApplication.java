package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.ChatFacadeAsync;
import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;

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
	void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory);
}
