package com.backenddevelopment.webapplication.common;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.backenddevelopment.webapplication.exceptions.NotFoundException;

@RestControllerAdvice
public class ExceptionAdvice {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<CustomErrorResponse> HandleExceptionNotFound(NotFoundException ex){
		CustomErrorResponse error = new CustomErrorResponse();
		error.setTimestamp(LocalDateTime.now());
		error.setMessage(ex.getMessage());
		error.setStatus("NOT_FOUND_EXCEPTION");
		error.setErrorCode(HttpStatus.NOT_FOUND.toString());
		
		return new ResponseEntity<CustomErrorResponse>(error,HttpStatus.NOT_FOUND);
	}

}
