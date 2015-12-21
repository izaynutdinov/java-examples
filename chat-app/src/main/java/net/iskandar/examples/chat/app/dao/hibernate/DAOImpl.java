package net.iskandar.examples.chat.app.dao.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import net.iskandar.examples.chat.app.dao.DAO;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;

public class DAOImpl implements DAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }	
	
	@Override
	public User getUser(String login, String passwordMd5) {
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

	@Override
	public List<ChatUser> getChatUsers(User user, Integer chatId) {
		Query query = getSession().createQuery("select cht from ChatUser cu where cu.chat.id=:chatId");
		query.setParameter("chatId", chatId);
		return query.list();
	}

	@Override
	public List<ChatMessage> getChatMessages(User user, Integer chatId,
			Date since) {
		Query query = getSession().createQuery("from ChatMessage cm where cm.chatUser.chat.id=:chatId and cm.time>=:since order by cm.id");
		query.setParameter("chatId", chatId);
		query.setDate("since", since);
		return query.list();
	}

	@Override
	public List<ChatMessage> updateChatMessages(User user, Integer[] chatIds,
			Integer lastMessageId) {
		Query query = getSession().createQuery("from ChatMessage cm where cm.chatUser.chat.id in :chatIds and cm.id > :lastMessageId order by cm.id");
		query.setParameterList("chatIds", chatIds);
		query.setInteger("lastMessageId", lastMessageId);
		return query.list();
	}

	@Override
	public ChatUser getChatUser(User user, Integer chatId) {
		Query query = getSession().createQuery("from ChatUser cu where cu.user=:user and cu.chat.id=:chatId");
		query.setParameter("user", user);
		query.setInteger("chatId", chatId);
		ChatUser chatUser = (ChatUser) query.uniqueResult();
		return chatUser;
	}

	@Override
	public void saveMessage(ChatMessage chatMessage) {
		getSession().save(chatMessage);
	}

	@Override
	public Chat getChat(Integer chatId) {
		return (Chat) getSession().get(Chat.class, chatId);
	}

}
