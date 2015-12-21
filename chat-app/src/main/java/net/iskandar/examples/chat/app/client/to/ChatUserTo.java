package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ChatUserTo implements IsSerializable {

	private Integer id;
	private Integer chatId;
	private UserTo user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getChatId() {
		return chatId;
	}

	public void setChatId(Integer chatId) {
		this.chatId = chatId;
	}

	public UserTo getUser() {
		return user;
	}

	public void setUser(UserTo user) {
		this.user = user;
	}
	
}
