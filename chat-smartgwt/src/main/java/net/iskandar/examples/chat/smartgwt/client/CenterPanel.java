package net.iskandar.examples.chat.smartgwt.client;

import net.iskandar.examples.chat.app.client.log.Logger;

import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.events.ResizedEvent;
import com.smartgwt.client.widgets.events.ResizedHandler;
import com.smartgwt.client.widgets.layout.VLayout;

public class CenterPanel extends VLayout implements AcceptsOneWidget {

	private static final Logger log = new Logger("CenterPanel");
	private Widget widget;
	
	public CenterPanel() {
		super();
		setPadding(0);
	}

	@Override
	public void setWidget(IsWidget w) {
		log.log("setWidget");
		if(widget == null && w != null){
			addResizedHandler(new ResizedHandler() {
				@Override
				public void onResized(ResizedEvent event) {
					if(widget != null && widget instanceof Resizeable){
						Resizeable resizeable = (Resizeable) widget;
						log.log("centerPanel.onResized");
						log.log("centerPanel.getWidth() = "
								+ getWidth());
						log.log("centerPanel.getHeight() = "
								+ getHeight());
						resizeable.resize(getWidth() - 5, getHeight() - 15);
					}
				}
			});
		}
		widget = w.asWidget();
		log.log("widget class name: " + widget.getClass().getName());
		if(widget instanceof Canvas){
			Canvas canvas = (Canvas) widget;
			canvas.setWidth(getWidth());
			canvas.setHeight(getHeight());
			setMembers((Canvas) widget);			
		} else {
			log.log("ERROR: setWidget - \"widget passed is not an instance of Canvas\"");
		}
	}


}
