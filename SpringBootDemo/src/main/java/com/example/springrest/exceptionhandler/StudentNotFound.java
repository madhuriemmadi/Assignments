package com.example.springrest.exceptionhandler;

public class StudentNotFound extends RuntimeException {

	public StudentNotFound(String message,Throwable cause) {
		super(message, cause);
	}
}
