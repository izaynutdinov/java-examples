package net.iskandar.examples.chat.app.dao;

import java.util.Date;
import java.util.List;

import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;

public interface DAO {

	User getUser(String login, String passwordMd5);
	User getUser(Integer userId);
	List<Chat> getChats(User user);
	List<ChatUser> getChatUsers(User user, Integer chatId);
	Chat getChat(Integer chatId);
	List<ChatMessage> getChatMessages(User user, Integer chatId, Date since);
	List<ChatMessage> updateChatMessages(User user, Integer[] chatIds, Integer lastMessageId);
	ChatUser getChatUser(User user, Integer chatId);
	void saveMessage(ChatMessage chatMessage);
	
}
