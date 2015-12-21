package net.iskandar.examples.chat.gxt.client;

import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;
import net.iskandar.examples.chat.app.client.mvp.views.ViewFactory;

public class ViewFactoryImpl implements ViewFactory {

	@Override
	public ChatView createChatView() {
		return new ChatPanel();
	}

}
