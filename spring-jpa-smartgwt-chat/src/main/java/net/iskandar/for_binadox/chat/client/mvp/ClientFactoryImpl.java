package net.iskandar.for_binadox.chat.client.mvp;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

import net.iskandar.for_binadox.chat.client.ChatFacade;
import net.iskandar.for_binadox.chat.client.ChatFacadeAsync;
import net.iskandar.for_binadox.chat.client.model.PollingChatModelImpl;
import net.iskandar.for_binadox.chat.client.model.StompChatModel;
import net.iskandar.for_binadox.chat.client.mvp.ui.ChatPanel;

public class ClientFactoryImpl implements ClientFactory {

	private static EventBus eventBus;
	private static ChatFacadeAsync chatFacade = GWT.create(ChatFacade.class);
	private static ChatPanel chatPanel;
	private static PlaceController placeController;	

	static {
		StompChatModel chatModel = new StompChatModel(new ClientFactoryImpl()); 
		chatPanel = new ChatPanel(chatModel);		
	}

	@Override
	public ChatPanel chatPanel() {
		return chatPanel;
	}

	@Override
	public ChatFacadeAsync chatFacade() {
		return chatFacade;
	}

	@Override
	public EventBus eventBus() {
		if (eventBus == null) eventBus = new SimpleEventBus();
		return eventBus;		
	}
	
	@Override
	public PlaceController placeController() {
		if (placeController == null) placeController = new PlaceController(eventBus());
		return placeController;
	}	

}
