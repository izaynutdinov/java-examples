package net.iskandar.examples.chat.app.service;

import java.util.List;

import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatMessages;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;

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
