package com.RestApiProject1.packages.Responses;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	
	public static ResponseEntity<Object> responseBuilder(String massege ,HttpStatus httpStatus,Object object)
	{
		Map<String ,Object> data = new HashMap<>();
		data.put("massege", massege);
		data.put("HttpStatus", httpStatus);
		data.put("data", object);
		return new ResponseEntity<>(data,httpStatus);
	}
}
