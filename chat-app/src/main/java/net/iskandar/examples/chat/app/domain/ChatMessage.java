package net.iskandar.examples.chat.app.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CHAT_MESSAGES")
public class ChatMessage {

	@Id
    @GeneratedValue
    private Integer id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="CHAT_USER_ID", nullable=false, updatable=false)
	private ChatUser chatUser;
	
	@Column(name="MSG_TIME")
	private Date time;
	
	@Column(name="MSG_TEXT", columnDefinition="text")
	private String text;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ChatUser getChatUser() {
		return chatUser;
	}

	public void setChatUser(ChatUser chatUser) {
		this.chatUser = chatUser;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
