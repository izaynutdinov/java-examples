package net.iskandar.examples.chat.app.client.to;

import java.io.Serializable;
import java.util.Date;

public class ChatMessageTo implements Serializable {
	
	private Integer id;
	private ChatUserTo chatUser;
	private String time;
	private String text;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ChatUserTo getChatUser() {
		return chatUser;
	}

	public void setChatUser(ChatUserTo chatUser) {
		this.chatUser = chatUser;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public String toString(){
		StringBuffer rep = new StringBuffer("ChatMessageTo ( from: ");
		rep.append(getChatUser().getUser().getFirstName());
		rep.append(" ");
		rep.append(getChatUser().getUser().getLastName());
		rep.append(", time: ");
		rep.append(getTime());
		rep.append(", text: ");
		rep.append(getText());
		return rep.toString();
	}

}
