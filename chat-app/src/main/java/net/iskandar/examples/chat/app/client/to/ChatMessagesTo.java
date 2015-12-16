package net.iskandar.examples.chat.app.client.to;

import java.io.Serializable;
import java.util.List;

public class ChatMessagesTo implements Serializable {

	private Integer chatId;
	private Integer lastMessageId;
	private List<ChatMessageTo> messages;

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public Integer getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(Integer lastMessageId) {
		this.lastMessageId = lastMessageId;
	}

	public List<ChatMessageTo> getMessages() {
		return messages;
	}

	public void setMessages(List<ChatMessageTo> messages) {
		this.messages = messages;
	}

}
