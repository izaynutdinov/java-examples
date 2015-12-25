package net.iskandar.examples.chat.app.domain;

import java.util.List;

public class ChatMessages {

	private Integer chatId;
	private Chat chat;
	private Integer lastMessageId;
	private List<ChatMessage> chatMessages;

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public Integer getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(Integer lastMessageId) {
		this.lastMessageId = lastMessageId;
	}

	public List<ChatMessage> getChatMessages() {
		return chatMessages;
	}

	public void setChatMessages(List<ChatMessage> chatMessages) {
		this.chatMessages = chatMessages;
	}
	
}
