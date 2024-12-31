package com.RestApiProject1.packages.Exceptions;

import org.springframework.http.HttpStatus;

public class CloudVenderNotFoundException extends RuntimeException{

	public CloudVenderNotFoundException(String message) {
		super(message);
	}

	public CloudVenderNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
