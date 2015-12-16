package net.iskandar.examples.chat.smartgwt.client;

import net.iskandar.examples.chat.app.client.mvp.ChatApplication;
import net.iskandar.examples.chat.app.client.mvp.ViewFactory;
import net.iskandar.examples.chat.app.client.mvp.views.ChatView;

public class ViewFactoryImpl implements ViewFactory {

	@Override
	public ChatView createChatView(ChatApplication chatApplication) {
		ChatPanel chatPanel = new ChatPanel(chatApplication.getChatModel());
		chatPanel.setMargin(10);
//		chatPanel.setBorder("2px solid red");
		chatPanel.setVisible(false);
		chatPanel.getElement().addClassName("chat-panel");
		return chatPanel;
	}


}
