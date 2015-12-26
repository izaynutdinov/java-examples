package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;

public interface ChatApplicationInternal extends ChatApplication {
	EventBus getEventBus();
	ChatView getChatView();	
	PlaceController getPlaceController();
	ChatModel getChatModel();
}
