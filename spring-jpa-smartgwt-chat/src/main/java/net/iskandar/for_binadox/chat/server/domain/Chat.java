package net.iskandar.for_binadox.chat.server.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CHATS")
public class Chat {

	@Id
    @GeneratedValue
    private Integer id;
	
	@ManyToOne(optional=false, cascade=CascadeType.ALL)
	@JoinColumn(name="OWNER_ID", nullable=false)
	private User owner;
	
	@Column(name="TITLE")
	private String title;
	
	@Column(name="DESCRIPTION", columnDefinition="text")
	private String description;
	
	@Column(name="LAST_MESSAGE_ID")
	private Integer lastMessageId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLastMessageId() {
		return lastMessageId;
	}

	public void setLastMessageId(Integer lastMessageId) {
		this.lastMessageId = lastMessageId;
	}
	
}
