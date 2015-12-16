package net.iskandar.examples.chat.app.client;

import java.io.Serializable;

public class ChatFacadeException extends Exception implements Serializable {

	public enum ErrorCode {
		NOT_LOGGED_IN,
		SERVICE_ERROR,
		UNKNOWN
	}

	private ErrorCode errorCode;
	
	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public ChatFacadeException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChatFacadeException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

}
