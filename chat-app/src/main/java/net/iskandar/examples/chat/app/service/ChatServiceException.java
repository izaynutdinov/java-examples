package net.iskandar.examples.chat.app.service;

public class ChatServiceException extends Exception {

	private static final long serialVersionUID = 1409950129022050834L;

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
