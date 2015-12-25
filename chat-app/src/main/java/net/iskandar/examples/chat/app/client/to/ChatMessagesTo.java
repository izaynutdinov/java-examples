package net.iskandar.examples.chat.app.client.to;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ChatMessagesTo implements IsSerializable {

	private Integer chatId;
	private ChatTo chat;	
	private Integer lastMessageId;
	private List<ChatMessageTo> messages;

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public ChatTo getChat() {
		return chat;
	}

	public void setChat(ChatTo chat) {
		this.chat = chat;
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
