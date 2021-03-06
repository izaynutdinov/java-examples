package net.iskandar.examples.chat.app.client.to;

import com.google.gwt.user.client.rpc.IsSerializable;

public class UserTo implements IsSerializable {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private String login;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
}
