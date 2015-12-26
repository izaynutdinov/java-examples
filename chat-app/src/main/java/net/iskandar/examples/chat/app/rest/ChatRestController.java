package net.iskandar.examples.chat.app.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import net.iskandar.examples.chat.app.Utils;
import net.iskandar.examples.chat.app.client.to.ChatMessagesTo;
import net.iskandar.examples.chat.app.client.to.ChatTo;
import net.iskandar.examples.chat.app.domain.Chat;
import net.iskandar.examples.chat.app.domain.ChatMessages;
import net.iskandar.examples.chat.app.domain.User;
import net.iskandar.examples.chat.app.service.ChatService;
import net.iskandar.examples.chat.app.service.ChatServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRestController {

	private static final Logger log = LogManager.getLogger(ChatRestController.class);
	
	@Autowired
	private ChatService chatService;

	@RequestMapping(value="/chats", method=RequestMethod.GET, 
			produces={MediaType.APPLICATION_JSON_VALUE,
			          MediaType.APPLICATION_XML_VALUE})
	@ResponseBody
	public RestResponse<List<ChatTo>> getChats(HttpServletRequest request){
		log.debug("getChats");
		User user = getCurrentUser(request);
		if(user == null)
			return new RestResponse<List<ChatTo>>(-1, "You are not logged in");
		List<ChatTo> result = new ArrayList<ChatTo>();
		for(Chat chat : chatService.getChats(user)){
			result.add(Utils.createChatTo(chat));
		}
		return new RestResponse<List<ChatTo>>(result);
	}
	
	@RequestMapping(value="/chats/{chatId}", method=RequestMethod.GET, 
			       produces=MediaType.APPLICATION_JSON_VALUE)
	public RestResponse<ChatMessagesTo> getChatMessages(HttpServletRequest request, 
			@PathVariable("chatId") Integer chatId, 
			@RequestParam(name="days", defaultValue="0") Integer days){
		log.debug("getChatMessages");
		User user = getCurrentUser(request);
		if(user == null)
			return new RestResponse<ChatMessagesTo>(-1, "You are not logged in");
		try {
			ChatMessages chatMessages = chatService.getChatMessages(user, chatId, days);
			return new RestResponse<ChatMessagesTo>(Utils.createChatMessagesTo(chatMessages));
		} catch (ChatServiceException e) {
			return new RestResponse<ChatMessagesTo>(-2, "Internal server error");
		}		
	}
	
	public static  class MessageText {
		private String text;

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}
	
	@RequestMapping(value="/chats/{chatId}", method=RequestMethod.POST, 
				produces=MediaType.APPLICATION_JSON_VALUE, 
				consumes=MediaType.APPLICATION_JSON_VALUE)
	public RestResponse<Void> postMessage(HttpServletRequest request, 
										  @PathVariable("chatId") Integer chatId,
										  @RequestBody MessageText messageText){
		log.debug("postMessage text=" + messageText.text);
		User user = getCurrentUser(request);
		if(user == null)
			return new RestResponse<Void>(-1, "You are not logged in");
		try {
			chatService.postMessage(user, chatId, messageText.text);
			return new RestResponse<Void>(null);
		} catch (ChatServiceException e) {
			log.error("postMessage error: ", e);
			return new RestResponse<Void>(-1, e.getMessage());
		}
	}

	private User getCurrentUser(HttpServletRequest request){
		return Utils.getCurrentUser(request, chatService);
	}

}
