package com.ty.springrestapi.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiError {

	String message;
	String path;
	HttpStatus httpStatus;
	LocalDateTime localDateTime;
	
	public String getMessage() {
		return message;
	}
	public String getPath() {
		return path;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
}
