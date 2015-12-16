package net.iskandar.examples.chat.app.client.mvp;

import net.iskandar.examples.chat.app.client.mvp.views.ChatView;

public interface ViewFactory {
	ChatView createChatView(ChatApplication chatApplication);
}
