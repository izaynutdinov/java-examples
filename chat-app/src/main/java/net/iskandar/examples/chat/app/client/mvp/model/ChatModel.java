package net.iskandar.examples.chat.app.client.mvp.model;

import java.util.List;

import net.iskandar.examples.chat.app.client.ChatFacadeException;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;

public interface ChatModel {

	public interface Listener {
		void chatError(ChatFacadeException error);
		void newMessages(ChatModel sender, List<ChatMessageTo> messages);
	}

	void addListener(Listener listener);
	void removeListener(Listener listener);
	void init(Integer chatId, int daysMessages);
	void postMessage(String text);

}
