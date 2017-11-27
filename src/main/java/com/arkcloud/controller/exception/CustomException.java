package com.arkcloud.controller.exception;
/**
 * 
 * @author lizhen
 * @date 2017年11月26日
 * @version 1.0
 */
@SuppressWarnings("serial")
public class CustomException extends Exception {
	private String message;

	public CustomException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
