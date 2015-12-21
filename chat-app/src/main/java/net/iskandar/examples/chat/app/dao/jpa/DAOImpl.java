package net.iskandar.examples.chat.app.dao.jpa;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import net.iskandar.examples.chat.app.dao.DAO;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;

public class DAOImpl implements DAO {

	@PersistenceContext
	private EntityManager em;	

	@Override
	public User getUser(String login, String passwordMd5) {
		Query q = em.createQuery("from User u where u.login=:login and u.passwordMd5=:passwordMd5");
		q.setParameter("login", login);
		q.setParameter("passwordMd5", passwordMd5);
		q.setMaxResults(1);
		List<User> results = q.getResultList();
		if(results.size() > 0)
			return results.get(0);
		return null;
	}

	@Override
	public User getUser(Integer userId) {
		return em.find(User.class, userId);
	}

	@Override
	public List<Chat> getChats(User user) {
		Query q = em.createQuery("select cht from ChatUser cu left join cu.chat cht where cu.user=:user and cu.blocked=false order by cu.chat.title");
		q.setParameter("user", user);
		return q.getResultList();
	}

	@Override
	public List<ChatUser> getChatUsers(User user, Integer chatId) {
		Query query = em.createQuery("select cht from ChatUser cu where cu.chat.id=:chatId");
		query.setParameter("chatId", chatId);
		return query.getResultList();
	}

	@Override
	public Chat getChat(Integer chatId) {
		return em.find(Chat.class, chatId);
	}

	@Override
	public List<ChatMessage> getChatMessages(User user, Integer chatId,
			Date since) {
		Query query = em.createQuery("from ChatMessage cm where cm.chatUser.chat.id=:chatId and cm.time>=:since order by cm.id");
		query.setParameter("chatId", chatId);
		query.setParameter("since", since);
		List<ChatMessage> messages = query.getResultList();
		return messages;
	}

	@Override
	public List<ChatMessage> updateChatMessages(User user, Integer[] chatIds,
			Integer lastMessageId) {
		Query query = em.createQuery("from ChatMessage cm where cm.chatUser.chat.id in :chatIds and cm.id > :lastMessageId order by cm.id");
		query.setParameter("chatIds", Arrays.asList(chatIds));
		query.setParameter("lastMessageId", lastMessageId);
		return query.getResultList();
	}

	@Override
	public ChatUser getChatUser(User user, Integer chatId) {
		Query query = em.createQuery("from ChatUser cu where cu.user=:user and cu.chat.id=:chatId");
		query.setParameter("user", user);
		query.setParameter("chatId", chatId);
		ChatUser chatUser = (ChatUser) query.getSingleResult();
		return chatUser;
	}

	@Override
	public void saveMessage(ChatMessage chatMessage) {
		em.persist(chatMessage);
	}

}
