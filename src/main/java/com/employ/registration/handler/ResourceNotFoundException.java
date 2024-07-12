package com.employ.registration.handler;

public class ResourceNotFoundException extends RuntimeException{
        public ResourceNotFoundException(String msg) {
        	super(msg);
        }
}
