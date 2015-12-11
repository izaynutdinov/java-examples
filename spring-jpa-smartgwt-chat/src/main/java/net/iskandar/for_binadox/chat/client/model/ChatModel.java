package net.iskandar.for_binadox.chat.client.model;

import java.util.List;

import net.iskandar.for_binadox.chat.client.ChatFacadeException;
import net.iskandar.for_binadox.chat.client.to.ChatMessageTo;

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
