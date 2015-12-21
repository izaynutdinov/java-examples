package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ChatTo implements IsSerializable {

	private Integer id;
	private String title;
	private String description;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
