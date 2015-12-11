package net.iskandar.for_binadox.chat.client;

import net.iskandar.for_binadox.chat.client.log.Logger;

import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

public class Initializer2Impl implements Initializer {

	private static final Logger log = new Logger(Initializer1Impl.class.getSimpleName());
	
	@Override
	public void initApp() {
		log.log("Initialization started!");
		Window.enableScrolling(false);		
		SplitLayoutPanel splitLayoutPanel = createSplitPanel();
		splitLayoutPanel.setWidth(Window.getClientWidth() + "px");
		splitLayoutPanel.setHeight(Window.getClientHeight() + "px");
		RootPanel.get().add(createSplitPanel());
	}

	public SplitLayoutPanel createSplitPanel() {
		// Create a Split Panel
		SplitLayoutPanel splitPanel = new SplitLayoutPanel(5);
		splitPanel.ensureDebugId("cwSplitLayoutPanel");
		splitPanel.getElement().getStyle()
				.setProperty("border", "3px solid #e7e7e7");

		// Add text all around.

		splitPanel.addWest(new Label("WEST"), 100);
		final SimplePanel centerLabel = new SimplePanel();
		centerLabel.addHandler(new ResizeHandler() {
			@Override
			public void onResize(ResizeEvent event) {
				log.log("onResize width=" + centerLabel.getOffsetWidth()
						+ ", height=" + centerLabel.getOffsetHeight());
			}
		}, ResizeEvent.getType());
		splitPanel.add(centerLabel);

		// Return the content
		return splitPanel;
	}

}
