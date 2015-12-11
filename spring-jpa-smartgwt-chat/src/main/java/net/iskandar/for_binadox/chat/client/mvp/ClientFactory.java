package net.iskandar.for_binadox.chat.client.mvp;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

import net.iskandar.for_binadox.chat.client.ChatFacadeAsync;
import net.iskandar.for_binadox.chat.client.mvp.ui.ChatPanel;

public interface ClientFactory {
	ChatPanel chatPanel();
	ChatFacadeAsync chatFacade();
	EventBus eventBus();
	PlaceController placeController();
}
