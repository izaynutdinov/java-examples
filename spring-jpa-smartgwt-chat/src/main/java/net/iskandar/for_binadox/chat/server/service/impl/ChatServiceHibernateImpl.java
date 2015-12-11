package net.iskandar.for_binadox.chat.server.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;

import net.iskandar.for_binadox.chat.server.Utils;
import net.iskandar.for_binadox.chat.server.domain.Chat;
import net.iskandar.for_binadox.chat.server.domain.ChatMessage;
import net.iskandar.for_binadox.chat.server.domain.ChatMessages;
import net.iskandar.for_binadox.chat.server.domain.ChatUser;
import net.iskandar.for_binadox.chat.server.domain.User;
import net.iskandar.for_binadox.chat.server.service.ChatService;
import net.iskandar.for_binadox.chat.server.service.ChatServiceException;

public class ChatServiceHibernateImpl extends BaseHibernateService implements ChatService {

	private static final Logger log = LogManager.getLogger(ChatServiceHibernateImpl.class);
	
	@Autowired
	private SimpMessageSendingOperations messaging;
	
	@Override
	public User login(String login, String password) {
		String passwordMd5 = DigestUtils.md2Hex(password);
		Query query = getSession().createQuery("from User u where u.login=:login and u.passwordMd5=:passwordMd5");
		query.setString("login", login);
		query.setString("passwordMd5", passwordMd5);
		return (User) query.uniqueResult();
	}

	@Override
	public User getUser(Integer userId) {
		return (User) getSession().get(User.class, userId);
	}

	@Override
	public List<Chat> getChats(User user) {
		Query query = getSession().createQuery("select cht from ChatUser cu left join cu.chat cht where cu.user=:user and cu.blocked=false");
		query.setParameter("user", user);
		return query.list();
	}

	public List<ChatUser> getChatUsers(User user, Integer chatId) throws ChatServiceException {
		ChatUser chatUser = getChatUser(user, chatId);
		if(chatUser == null){
			throw new ChatServiceException("User " + user.getId() + " is not permitted to get members of chat " + chatId + "!");			
		}
		Query query = getSession().createQuery("select cht from ChatUser cu where cu.chat.id=:chatId");
		query.setParameter("chatId", chatId);
		return query.list();		
	}

	@Override
	public ChatMessages getChatMessages(User user, Integer chatId, int days)
			throws ChatServiceException {
		ChatUser chatUser = getChatUser(user, chatId);
		if(chatUser != null){
			try {
				ChatMessages chatMessages = new ChatMessages(); 
				Chat chat = (Chat) getSession().get(Chat.class, chatId);
				chatMessages.setChatId(chatId);
				chatMessages.setLastMessageId(chat.getLastMessageId());

				Query query = getSession().createQuery("from ChatMessage cm where cm.chatUser.chat.id=:chatId and cm.time>=:today order by cm.id");
				query.setParameter("chatId", chatId);
				Date today = getMinusDays(days);
				log.debug("GETTING MESSAGES FOR DAY: " + today);
				query.setDate("today", today);
				List<ChatMessage> messages = query.list();
				for(ChatMessage message : messages){
					if(message.getId().compareTo(chatMessages.getLastMessageId()) > 0){
						chatMessages.setLastMessageId(message.getId());
					}
				}

				chatMessages.setChatMessages(messages);
				return chatMessages;
			} catch(Throwable t){
				t.printStackTrace();
				throw new ChatServiceException(t.getMessage(), t);
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
		Query query = getSession().createQuery("from ChatMessage cm where cm.chatUser.chat.id in :chatIds and cm.id > :lastMessageId order by cm.id");
		query.setParameterList("chatIds", chatIds);
		query.setInteger("lastMessageId", lastMessageId);
		return query.list();
	}

	private ChatUser getChatUser(User user, Integer chatId){
		Query query = getSession().createQuery("from ChatUser cu where cu.user=:user and cu.chat.id=:chatId");
		query.setParameter("user", user);
		query.setInteger("chatId", chatId);
		ChatUser chatUser = (ChatUser) query.uniqueResult();
		return chatUser;
	}

	@Override
	@Transactional
	public void postMessage(User user, Integer chatId, String text) throws ChatServiceException {
		ChatUser chatUser = getChatUser(user, chatId);
		if(chatUser != null){
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setChatUser(chatUser);
			chatMessage.setTime(new Date());
			chatMessage.setText(text);
			getSession().save(chatMessage);
			log.debug("postMessage lastMessageId=" + chatMessage.getId());
			chatUser.getChat().setLastMessageId(chatMessage.getId());
			messaging.convertAndSend("/chats/" + chatId, Utils.createChatMessageTo(chatMessage));
		} else {
			throw new ChatServiceException("User \"" + user.getLogin() + "\" is not permitted to post to chat - " + chatId);
		}
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

	public static void main(String[] args){
		System.out.println(getMinusDays(0));
	}

}
