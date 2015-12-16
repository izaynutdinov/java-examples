package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.ChatFacade;
import net.iskandar.examples.chat.app.client.ChatFacadeAsync;
import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.places.ChatPlace;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.event.shared.EventBus;

public abstract class ChatApplicationBaseImpl implements ChatApplication {

	private EventBus eventBus = new SimpleEventBus();
	private ChatFacadeAsync chatFacade = GWT.create(ChatFacade.class);
	private PlaceController placeController;
	private ChatModel chatModel;
	private ChatView chatView;
	private ViewFactory viewFactory;

	public EventBus getEventBus() {
		return eventBus;
	}

	public ChatFacadeAsync getChatFacade() {
		return chatFacade;
	}

	public PlaceController getPlaceController() {
		return placeController;
	}

	public ChatModel getChatModel() {
		return chatModel;
	}

	public ChatView getChatView() {
		return chatView;
	}

	public ViewFactory getViewFactory() {
		return viewFactory;
	}

	@Override
	public void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory) {
		this.viewFactory = viewFactory;
		chatModel = createChatModel();
		placeController = new PlaceController(eventBus);		
		chatView = viewFactory.createChatView(this);

		ChatActivityMapper activityMapper = new ChatActivityMapper(this);				
		ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
		activityManager.setDisplay(centerWidget);

		ChatPlacesHistoryMapper historyMapper= GWT.create(ChatPlacesHistoryMapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
        historyHandler.register(placeController, eventBus, new ChatPlace("1"));				

        historyHandler.handleCurrentHistory();		        
	}

	protected abstract ChatModel createChatModel();

}
