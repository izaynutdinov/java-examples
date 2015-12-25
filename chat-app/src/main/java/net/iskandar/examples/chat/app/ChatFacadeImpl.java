package net.iskandar.examples.chat.app;

import java.util.ArrayList;

import static java.lang.System.out;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.iskandar.examples.chat.app.client.ChatFacade;
import net.iskandar.examples.chat.app.client.ChatFacadeException;
import net.iskandar.examples.chat.app.client.ChatFacadeException.ErrorCode;
import net.iskandar.examples.chat.app.client.to.ChatMessageTo;
import net.iskandar.examples.chat.app.client.to.ChatMessagesTo;
import net.iskandar.examples.chat.app.client.to.ChatTo;
import net.iskandar.examples.chat.app.client.to.ChatUserTo;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessage;
import net.iskandar.examples.chat.app.domain.ChatMessages;
import net.iskandar.examples.chat.app.domain.ChatUser;
import net.iskandar.examples.chat.app.domain.User;
import net.iskandar.examples.chat.app.service.ChatService;
import net.iskandar.examples.chat.app.service.ChatServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class ChatFacadeImpl extends RemoteServiceServlet implements ChatFacade {

	private static final long serialVersionUID = -1495578471250482309L;
	
	private static final Logger log = LogManager.getLogger(ChatFacadeImpl.class);
	private ChatService chatService;

	public ChatService getChatService() {
		return chatService;
	}

	public void setChatService(ChatService chatService) {
		this.chatService = chatService;
	}

	@Override
	public String processCall(String payload) throws SerializationException {
		// TODO Auto-generated method stub
		out.println("Processing call payload=[" + payload + "]");
		return super.processCall(payload);
	}

	private User getCurrentUser(){
		return Utils.getCurrentUser(getThreadLocalRequest(), chatService);
	}

	@Override
	public List<ChatTo> getChats() throws ChatFacadeException {
		User currentUser = getCurrentUser();
		if(currentUser == null)
			throw createNotLoggedIn("You are not logged in!");
		List<ChatTo> result = new ArrayList<ChatTo>();
		for(Chat chat : chatService.getChats(currentUser)){
			result.add(Utils.createChatTo(chat));
		}
		return result;
	}

	@Override
	public List<ChatUserTo> getChatUsers(Integer chatId)
			throws ChatFacadeException {
		User currentUser = getCurrentUser();
		if(currentUser == null)
			throw createNotLoggedIn("You are not logged in!");
		List<ChatUserTo> results = new ArrayList<ChatUserTo>();
		try {
			for(ChatUser chatUser : chatService.getChatUsers(currentUser, chatId)){
				results.add(Utils.createChatUserTo(chatUser));
			}
		} catch(ChatServiceException ex){
			throw createServiceError(ex);
		}
		return results;
	}

	@Override
	public ChatMessagesTo getChatMessages(Integer chatId, int days)
			throws ChatFacadeException {
		log.debug("getChatMessages chatId=" + chatId + ", days=" + days);
		
		User currentUser = getCurrentUser();
		if(currentUser == null)
			throw createNotLoggedIn("You are not logged in!");
		try {
			ChatMessages chatMessages = chatService.getChatMessages(currentUser, chatId, days);
			return Utils.createChatMessagesTo(chatMessages);
		} catch (ChatServiceException e) {
			throw createServiceError(e);
		}
	}

	@Override
	public List<ChatMessageTo> updateChatMessages(Integer[] chats,
			Integer lastMessageId) throws ChatFacadeException {
		User currentUser = getCurrentUser();
		if(currentUser == null)
			throw createNotLoggedIn("You are not logged in!");
		try {
			List<ChatMessageTo> result = new ArrayList<ChatMessageTo>();
			for(ChatMessage chatMessage : chatService.updateChatMessages(currentUser, chats, lastMessageId)){
				result.add(Utils.createChatMessageTo(chatMessage));
			}
			return result;
		} catch (ChatServiceException e) {
			throw createServiceError(e);
		}
	}

	@Override
	public void postMessage(Integer chatId, String text)
			throws ChatFacadeException {
		User user = getCurrentUser();
		if(user == null)
			throw createNotLoggedIn("You are not logged in!");		
		try {
			chatService.postMessage(user, chatId, text);
		} catch (ChatServiceException e) {
			log.error("postMessage error: ", e);
			throw createServiceError(e);
		}
	}

	private static ChatFacadeException createServiceError(ChatServiceException ex) throws ChatFacadeException {
		return new ChatFacadeException(ErrorCode.SERVICE_ERROR, ex.getMessage());
	}	

	private static ChatFacadeException createNotLoggedIn(String message) throws ChatFacadeException {
		return new ChatFacadeException(ErrorCode.NOT_LOGGED_IN, message);
	}	

}
