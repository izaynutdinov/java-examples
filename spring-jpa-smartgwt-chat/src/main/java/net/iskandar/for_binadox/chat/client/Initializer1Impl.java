package net.iskandar.for_binadox.chat.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

import net.iskandar.for_binadox.chat.client.log.Logger;
import net.iskandar.for_binadox.chat.client.mvp.ClientFactory;
import net.iskandar.for_binadox.chat.client.mvp.ui.ChatPanel;

public class Initializer1Impl implements Initializer {

	private static final Logger log = new Logger(Initializer1Impl.class.getSimpleName());
	private static final ClientFactory clientFactory = GWT.create(ClientFactory.class);
	
	@Override
	public void initApp() {
		log.log("Initialization started!");		
		Window.enableScrolling(false);		
		final ChatPanel chatPanel = clientFactory.chatPanel();
		chatPanel.setChatId(1);
		chatPanel.setWidth(Window.getClientWidth()-15);
		chatPanel.setHeight(Window.getClientHeight()-30);
		Window.addResizeHandler(new ResizeHandler(){
			
			@Override
			public void onResize(ResizeEvent event) {
				chatPanel.minimizeTextArea();
				Initializer1Impl.log.log("onWindowResizeHandler");
				int newWidth = Window.getClientWidth() - 15;
				int newHeight = Window.getClientHeight() - 30;
				Initializer1Impl.log.log("onResize newWidth=" + newWidth + ", newHeight=" + newHeight);						
				chatPanel.setWidth(newWidth);
				chatPanel.setHeight(newHeight);
			}

		});
		RootPanel.get().add(chatPanel);
	}

}
