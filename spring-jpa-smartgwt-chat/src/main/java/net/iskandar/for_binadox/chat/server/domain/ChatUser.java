package net.iskandar.for_binadox.chat.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CHAT_USERS")
public class ChatUser {

	@Id
    @GeneratedValue
    @Column(name="ID")
    private Integer id;

	@ManyToOne(optional=false)
	@JoinColumn(name="CHAT_ID", nullable=false, updatable=false)
	private Chat chat;

	@ManyToOne(optional=false)
	@JoinColumn(name="USER_ID", nullable=false, updatable=false)	
	private User user;

	@Column(name="BLOCKED")
	private boolean blocked;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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
