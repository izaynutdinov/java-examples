package net.iskandar.for_binadox.chat.client;

import java.util.List;

import net.iskandar.for_binadox.chat.client.to.ChatMessageTo;
import net.iskandar.for_binadox.chat.client.to.ChatMessagesTo;
import net.iskandar.for_binadox.chat.client.to.ChatTo;
import net.iskandar.for_binadox.chat.client.to.ChatUserTo;
import net.iskandar.for_binadox.chat.server.service.ChatService;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("facade")
public interface ChatFacade extends RemoteService {

	List<ChatTo> getChats() throws ChatFacadeException;
	List<ChatUserTo> getChatUsers(Integer chatId) throws ChatFacadeException;
	ChatMessagesTo getChatMessages(Integer chatId, int days) throws ChatFacadeException;
	List<ChatMessageTo> updateChatMessages(Integer[] chats, Integer lastMessageId) throws ChatFacadeException;
	void postMessage(Integer chatId, String text) throws ChatFacadeException;

}
