package com.RestApiProject1.packages.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVenderExceptionHandler {
	
	@ExceptionHandler(value= {CloudVenderNotFoundException.class})
	public ResponseEntity<Object> handleCloudVenderNotFoundException(CloudVenderNotFoundException cloudVenderNotFoundException)
	{
		CloudVenderException cloudVenderException =  new CloudVenderException(
				
				cloudVenderNotFoundException.getMessage(),
				cloudVenderNotFoundException.getCause(),
			    HttpStatus.NOT_FOUND
		) ;
		return new ResponseEntity<Object>(cloudVenderException, HttpStatus.NOT_FOUND);
	}
}
