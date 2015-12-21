package net.iskandar.examples.chat.app.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {

	Resources INSTANCE = GWT.create(Resources.class);

	@Source("chat.png")
	ImageResource chatIcon();

	@Source("folder.png")
	ImageResource folderIcon();

}
