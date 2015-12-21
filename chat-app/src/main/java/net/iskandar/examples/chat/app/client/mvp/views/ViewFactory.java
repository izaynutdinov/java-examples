package net.iskandar.examples.chat.app.client.mvp.views;

import net.iskandar.examples.chat.app.client.mvp.ChatApplication;

public interface ViewFactory {
	ChatView createChatView();
}
