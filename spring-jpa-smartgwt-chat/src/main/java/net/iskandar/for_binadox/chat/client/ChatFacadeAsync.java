package net.iskandar.for_binadox.chat.client;

import java.util.List;

import net.iskandar.for_binadox.chat.client.to.ChatMessageTo;
import net.iskandar.for_binadox.chat.client.to.ChatMessagesTo;
import net.iskandar.for_binadox.chat.client.to.ChatTo;
import net.iskandar.for_binadox.chat.client.to.ChatUserTo;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ChatFacadeAsync {

	void getChats(AsyncCallback<List<ChatTo>> callback);
	
	void getChatUsers(Integer chatId, AsyncCallback<List<ChatUserTo>> callback);

	void getChatMessages(Integer chatId, int days,
			AsyncCallback<ChatMessagesTo> callback);

	void updateChatMessages(Integer[] chats, Integer lastMessageId, AsyncCallback<List<ChatMessageTo>> callback);

	void postMessage(Integer chatId, String text, AsyncCallback<Void> callback);



}
