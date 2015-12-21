package net.iskandar.examples.chat.app.service.impl;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import net.iskandar.examples.chat.app.Utils;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.dao.DAO;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatMessages;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;
import net.iskandar.examples.chat.app.service.ChatService;
import net.iskandar.examples.chat.app.service.ChatServiceException;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

public class ChatServiceImpl implements ChatService {

	private static final Logger log = LogManager.getLogger(ChatServiceImpl.class);

	private DAO dao;
	private MessageChannel channel;

	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	public MessageChannel getChannel() {
		return channel;
	}

	public void setChannel(MessageChannel channel) {
		this.channel = channel;
	}

	@Override
	public User login(String login, String password) {
		String passwordMd5 = DigestUtils.md2Hex(password);
		return dao.getUser(login, passwordMd5);
	}

	@Override
	public User getUser(Integer userId) {
		return dao.getUser(userId);
	}

	@Override
	public List<Chat> getChats(User user) {
		return dao.getChats(user);
	}

	@Override
	public List<ChatUser> getChatUsers(User user, Integer chatId) throws ChatServiceException {
		ChatUser chatUser = getChatUser(user, chatId);
		if(chatUser == null){
			throw new ChatServiceException("User " + user.getId() + " is not permitted to get members of chat " + chatId + "!");			
		}
		return dao.getChatUsers(user, chatId);
	}

	@Override
	public ChatMessages getChatMessages(User user, Integer chatId, int days)
			throws ChatServiceException {
		ChatUser chatUser = getChatUser(user, chatId);
		if(chatUser != null){
			try {
				ChatMessages chatMessages = new ChatMessages(); 
				Chat chat = dao.getChat(chatId); 
				chatMessages.setChatId(chatId);
				chatMessages.setLastMessageId(chat.getLastMessageId());
				Date since = getMinusDays(days);
				List<ChatMessage> messages = dao.getChatMessages(user, chatId, since);
				for(ChatMessage message : messages){
					if(message.getId().compareTo(chatMessages.getLastMessageId()) > 0){
						chatMessages.setLastMessageId(message.getId());
					}
				}
				chatMessages.setChatMessages(messages);
				return chatMessages;
			} catch(Throwable t){
				log.error("Unexpected exception getting chat messages", t);
				throw new ChatServiceException("Unexpected exception getting chat messages", t);
			}
		} else {
			throw new ChatServiceException("User " + user.getId() + " is not permitted to get chat messages for chat " + chatId + "!");
		}
	}

	@Override
	public List<ChatMessage> getAllChatMessages(User user, Chat chat)
			throws ChatServiceException {
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public List<ChatMessage> updateChatMessages(User user, Integer[] chatIds,
			Integer lastMessageId) throws ChatServiceException {
		for(Integer chatId : chatIds){
			ChatUser chatUser = getChatUser(user, chatId);
			if(chatUser == null)
				throw new ChatServiceException("User " + user.getId() + " is not permitted to update chat messages for chat " + chatId + "!");
		}
		return dao.updateChatMessages(user, chatIds, lastMessageId);
	}

	@Override
	@Transactional	
	public void postMessage(User user, Integer chatId, String text)
			throws ChatServiceException {
		ChatUser chatUser = getChatUser(user, chatId);
		if(chatUser != null){
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setChatUser(chatUser);
			chatMessage.setTime(new Date());
			chatMessage.setText(text);
			dao.saveMessage(chatMessage);
			Message<ChatMessageTo> message = MessageBuilder.withPayload(Utils.createChatMessageTo(chatMessage)).build();
			channel.send(message);
			log.debug("postMessage lastMessageId=" + chatMessage.getId());
			chatUser.getChat().setLastMessageId(chatMessage.getId());
		} else {
			throw new ChatServiceException("User \"" + user.getLogin() + "\" is not permitted to post to chat - " + chatId);
		}
	}

	private ChatUser getChatUser(User user, Integer chatId){
		return dao.getChatUser(user, chatId);
	}

	private static Date getMinusDays(int days){
		Calendar c = Calendar.getInstance();
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		c.add(Calendar.DAY_OF_YEAR, -days);
		return c.getTime();
	}	

}
