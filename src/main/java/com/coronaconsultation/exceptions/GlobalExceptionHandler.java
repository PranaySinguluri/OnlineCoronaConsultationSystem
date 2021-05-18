package com.coronaconsultation.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorDetails> handleException(Exception e){
		
		
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
		
	}
}
