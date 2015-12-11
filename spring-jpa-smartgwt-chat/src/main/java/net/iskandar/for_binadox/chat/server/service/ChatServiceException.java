package net.iskandar.for_binadox.chat.server.service;

public class ChatServiceException extends Exception {

	public ChatServiceException() {
		super();
	}

	public ChatServiceException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ChatServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ChatServiceException(String message) {
		super(message);
	}

	public ChatServiceException(Throwable cause) {
		super(cause);
	}

}
