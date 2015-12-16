package net.iskandar.examples.chat.app.websocket;

import net.iskandar.examples.chat.app.client.to.ChatMessageTo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class MessageReceiver {

	@Autowired
	private SimpMessagingTemplate messaging;

	public void receiveMessage(ChatMessageTo chatMessage){
		System.out.println("============================================================================================================================");
		System.out.println("MessageReceiver MESSAGE: from - " + chatMessage.getChatUser().getUser().getLogin() + " text - " + chatMessage.getText());
		System.out.println("============================================================================================================================");
		messaging.convertAndSend("/chats/" + chatMessage.getChatUser().getChatId(), chatMessage);
	}

}
