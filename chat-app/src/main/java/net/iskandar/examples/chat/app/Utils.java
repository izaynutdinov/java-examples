package net.iskandar.examples.chat.app;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.servlet.http.HttpServletRequest;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.ChatTo;
import net.iskandar.examples.chat.app.client.to.ChatUserTo;
import net.iskandar.examples.chat.app.client.to.UserTo;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;

public class Utils {

	private static final String USER_ID = "userId";
	private static DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM, Locale.US);

	public static Integer getUserId(HttpServletRequest req){
		return (Integer) req.getSession().getAttribute(USER_ID);
	}

	public static void setUserId(HttpServletRequest req, Integer userId){
		req.getSession().setAttribute(USER_ID, userId);
	}

	public static boolean isLoggedIn(HttpServletRequest req){
		return getUserId(req) != null;
	}

	public static void logout(HttpServletRequest req){
		req.getSession().removeAttribute(USER_ID);
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
	
	public static void main(String[] args){
		long time = new Date().getTime();
		time -= (5 * 60 * 60 * 1000);
		System.out.println(df.format(new Date(time)));
	}

}
