package net.iskandar.examples.chat.app.client.mvp;

import com.codeveo.gwt.stomp.client.StompJS;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import net.iskandar.examples.chat.app.client.mvp.model.ChatModel;
import net.iskandar.examples.chat.app.client.mvp.model.STOMPChatModel;
import net.iskandar.examples.chat.app.client.mvp.views.ViewFactory;

public class STOMPChatApplication extends ChatApplicationBaseImpl {

	private static boolean stompJSInstalled = false;
	
	@Override
	public void init(AcceptsOneWidget centerWidget, ViewFactory viewFactory) {
		if(!stompJSInstalled){
			StompJS.install();
			stompJSInstalled = true;
		}
		super.init(centerWidget, viewFactory);
	}

	@Override
	protected ChatModel createChatModel() {
		return new STOMPChatModel(this);
	}

}
