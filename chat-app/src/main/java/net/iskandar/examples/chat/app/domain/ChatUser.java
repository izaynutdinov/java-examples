package net.iskandar.examples.chat.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CHAT_USERS")
public class ChatUser extends BaseEntity {

	@ManyToOne(optional=false)
	@JoinColumn(name="CHAT_ID", nullable=false, updatable=false)
	private Chat chat;

	@ManyToOne(optional=false)
	@JoinColumn(name="USER_ID", nullable=false, updatable=false)	
	private User user;

	@Column(name="BLOCKED")
	private boolean blocked;

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

}
