package com.ty.springrestapi.exception;


import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
public class ExceptionClass {

	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=HttpMessageNotReadableException.class)
	ResponseEntity<ApiError> handleHttpMessageNotReadableException(HttpMessageNotReadableException httpMessageNotReadableException,
																	HttpServletRequest httpServletRequest){
		ApiError apiError = new ApiError();
		apiError.setHttpStatus(HttpStatus.BAD_REQUEST);
		apiError.setLocalDateTime(LocalDateTime.now());
		apiError.setMessage(httpMessageNotReadableException.getMessage());
		apiError.setPath(httpServletRequest.getServletPath());
		return new ResponseEntity<>(apiError,HttpStatus.BAD_REQUEST);
	}
	
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=ConstraintViolationException.class)
	ResponseEntity<ApiError> handleConstraintViolationExceptio(ConstraintViolationException constraintViolationException,
																	HttpServletRequest httpServletRequest){
		ApiError apiError = new ApiError();
		apiError.setHttpStatus(HttpStatus.BAD_REQUEST);
		apiError.setLocalDateTime(LocalDateTime.now());
		apiError.setMessage(constraintViolationException.getMessage());
		apiError.setPath(httpServletRequest.getServletPath());
		return new ResponseEntity<>(apiError,HttpStatus.BAD_REQUEST);
	}
	
}
