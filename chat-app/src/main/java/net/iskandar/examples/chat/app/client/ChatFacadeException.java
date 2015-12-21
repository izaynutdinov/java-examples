package net.iskandar.examples.chat.app.client;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ChatFacadeException extends Exception implements IsSerializable {

	private static final long serialVersionUID = -993022760143424973L;

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
