package net.iskandar.examples.chat.app.rest;

public class RestResponse<T> {

	private Integer status = 0;
	private String errorMessage;
	private T data;

	public RestResponse(Integer status, String errorMessage) {
		super();
		this.status = status;
		this.errorMessage = errorMessage;
	}

	public RestResponse(T data) {
		super();
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
