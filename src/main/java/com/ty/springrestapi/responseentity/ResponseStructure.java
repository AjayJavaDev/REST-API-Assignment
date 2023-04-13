package com.ty.springrestapi.responseentity;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ResponseStructure<T> {

	private T data;
	private HttpStatus statusmsg;
	private int code;
	private String msg;
}
