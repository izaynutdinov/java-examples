package net.iskandar.examples.chat.smartgwt.client;

import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;
import net.iskandar.examples.chat.app.client.mvp.views.ViewFactory;

public class ViewFactoryImpl implements ViewFactory {

	@Override
	public ChatView createChatView() {
		ChatPanel chatPanel = new ChatPanel();
		chatPanel.setMargin(5);
//		chatPanel.setBorder("2px solid red");
		chatPanel.setVisible(false);
		chatPanel.getElement().addClassName("chat-panel");
		return chatPanel;
	}


}
