package net.iskandar.for_binadox.chat.server.service;

import java.util.List;

import net.iskandar.for_binadox.chat.server.domain.Chat;
import net.iskandar.for_binadox.chat.server.domain.ChatMessages;
import net.iskandar.for_binadox.chat.server.domain.ChatUser;
import net.iskandar.for_binadox.chat.server.domain.User;
import net.iskandar.for_binadox.chat.server.domain.ChatMessage;

public interface ChatService {

	public static final Integer DEFAULT_CHAT_ID = 1;
	
	User login(String login, String password);
	User getUser(Integer userId);
	List<Chat> getChats(User user);
	
	List<ChatUser> getChatUsers(User user, Integer chatId) throws ChatServiceException;

	/**
	 * Returns chat messages for last n days
	 * @param user
	 * @param chat
	 * @param days
	 * @return
	 * @throws ChatServiceException
	 */
	ChatMessages getChatMessages(User user, Integer chatId, int days) throws ChatServiceException;
	
	/**
	 * Returns chat messages from the beginning
	 * @param user
	 * @param chat
	 * @return
	 * @throws ChatServiceException
	 */
	List<ChatMessage> getAllChatMessages(User user, Chat chat) throws ChatServiceException;
	List<ChatMessage> updateChatMessages(User user, Integer[] chatIds, Integer lastMessageId) throws ChatServiceException;
	
	void postMessage(User user, Integer chatId, String text) throws ChatServiceException;

}
