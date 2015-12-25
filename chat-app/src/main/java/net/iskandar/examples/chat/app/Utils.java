package net.iskandar.examples.chat.app;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.ChatMessagesTo;
import net.iskandar.examples.chat.app.client.to.ChatTo;
import net.iskandar.examples.chat.app.client.to.ChatUserTo;
import net.iskandar.examples.chat.app.client.to.UserTo;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatMessages;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;
import net.iskandar.examples.chat.app.service.ChatService;

public class Utils {

	private static final String USER_ID_ATTR_NAME = "net.iskandar.examples.chat.app.Utils.USER_ID";
	private static final String CURRENT_USER_ATTR_NAME = "net.iskandar.examples.chat.app.Utils.CURRENT_USER";
	
	private static DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.US);

	public static Integer getUserId(HttpServletRequest req){
		return (Integer) req.getSession().getAttribute(USER_ID_ATTR_NAME);
	}

	public static void setUserId(HttpServletRequest req, Integer userId){
		req.getSession().setAttribute(USER_ID_ATTR_NAME, userId);
	}

	public static boolean isLoggedIn(HttpServletRequest req){
		return getUserId(req) != null;
	}

	public static void logout(HttpServletRequest req){
		req.getSession().removeAttribute(USER_ID_ATTR_NAME);
	}

	public static User getCurrentUser(HttpServletRequest req, ChatService chatService){
		User user = (User) req.getAttribute(CURRENT_USER_ATTR_NAME);
		if(user != null)
			return user;
		Integer userId = getUserId(req);
		if(userId != null){
			user = chatService.getUser(userId);
			req.setAttribute(CURRENT_USER_ATTR_NAME, userId);
			return user;
		}
		return null;		
	}

	public static UserTo createUserTo(User user){
		UserTo userTo = new UserTo();
		userTo.setId(user.getId());
		userTo.setFirstName(user.getFirstName());
		userTo.setLastName(user.getLastName());
		userTo.setLogin(user.getLogin());
		return userTo;
	}

	public static ChatUserTo createChatUserTo(ChatUser chatUser){
		ChatUserTo chatUserTo = new ChatUserTo();
		chatUserTo.setId(chatUser.getId());
		chatUserTo.setChatId(chatUser.getChat().getId());
		chatUserTo.setUser(createUserTo(chatUser.getUser()));
		return chatUserTo;
	}

	public static ChatTo createChatTo(Chat chat){
		ChatTo chatTo = new ChatTo();
		chatTo.setId(chat.getId());
		chatTo.setTitle(chat.getTitle());
		chatTo.setDescription(chat.getDescription());
		return chatTo;
	}

	public static ChatMessageTo createChatMessageTo(ChatMessage chatMessage){
		ChatMessageTo chatMessageTo = new ChatMessageTo();
		chatMessageTo.setId(chatMessage.getId());
		chatMessageTo.setChatUser(createChatUserTo(chatMessage.getChatUser()));
		chatMessageTo.setTime(df.format(chatMessage.getTime()));
		chatMessageTo.setText(chatMessage.getText());
		return chatMessageTo;
	}

	public static ChatMessagesTo createChatMessagesTo(ChatMessages chatMessages){
		ChatMessagesTo chatMessagesTo = new ChatMessagesTo();
		List<ChatMessageTo> messages = new ArrayList<ChatMessageTo>();
		chatMessagesTo.setChatId(chatMessages.getChatId());
		chatMessagesTo.setChat(createChatTo(chatMessages.getChat()));
		chatMessagesTo.setLastMessageId(chatMessages.getLastMessageId());
		for(ChatMessage chatMessage : chatMessages.getChatMessages()){
			messages.add(Utils.createChatMessageTo(chatMessage));
		}
		chatMessagesTo.setMessages(messages);
		return chatMessagesTo;		
	}

	public static void main(String[] args){
		long time = new Date().getTime();
		time -= (5 * 60 * 60 * 1000);
		System.out.println(df.format(new Date(time)));
	}

}
