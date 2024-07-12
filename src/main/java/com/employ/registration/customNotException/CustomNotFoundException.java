package com.employ.registration.customNotException;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.employ.registration.handler.ResourceNotFoundException;
@ControllerAdvice
public class CustomNotFoundException {
	 @ExceptionHandler(MethodArgumentNotValidException.class)
	    @ResponseStatus(HttpStatus.BAD_REQUEST)
	    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
	        Map<String, String> errors = new HashMap<>();
	        ex.getBindingResult().getAllErrors().forEach(error -> {
	            String fieldName = ((FieldError) error).getField();
	            String errorMessage = error.getDefaultMessage();
	            errors.put(fieldName, errorMessage);
	        });
	        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
	    }
	 @ExceptionHandler(ResourceNotFoundException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    public ResponseEntity<String> handleResourceNotFound(ResourceNotFoundException ex) {
	       
	        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	    }

}
