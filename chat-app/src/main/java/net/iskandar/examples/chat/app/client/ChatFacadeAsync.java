package net.iskandar.examples.chat.app.client;

import java.util.List;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.ChatMessagesTo;
import net.iskandar.examples.chat.app.client.to.ChatTo;
import net.iskandar.examples.chat.app.client.to.ChatUserTo;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChatFacadeAsync {

	void getChats(AsyncCallback<List<ChatTo>> callback);
	void getChatUsers(Integer chatId, AsyncCallback<List<ChatUserTo>> callback);
	void getChatMessages(Integer chatId, int days,
			AsyncCallback<ChatMessagesTo> callback);
	void updateChatMessages(Integer[] chats, Integer lastMessageId, AsyncCallback<List<ChatMessageTo>> callback);
	void postMessage(Integer chatId, String text, AsyncCallback<Void> callback);

}
