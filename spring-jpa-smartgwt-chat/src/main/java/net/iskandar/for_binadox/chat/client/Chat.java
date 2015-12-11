package net.iskandar.for_binadox.chat.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.HTMLFlow;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.events.ResizedEvent;
import com.smartgwt.client.widgets.events.ResizedHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

import net.iskandar.for_binadox.chat.client.log.Logger;
import net.iskandar.for_binadox.chat.client.model.PollingChatModelImpl;
import net.iskandar.for_binadox.chat.client.mvp.ClientFactory;
import net.iskandar.for_binadox.chat.client.mvp.ui.ChatPanel;
import net.iskandar.for_binadox.chat.client.to.ChatTo;
import net.iskandar.for_binadox.chat.shared.FieldVerifier;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Chat implements EntryPoint {

	private static final Logger log = new Logger("Chat");

	private static final ClientFactory clientFactory = GWT.create(ClientFactory.class);

	private Initializer initializer = GWT.create(Initializer.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		initializer.initApp();
	}

}
