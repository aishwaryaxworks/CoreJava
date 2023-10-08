package com.xworkz.exceptions.exception;

public class EmailException extends Exception{
	public EmailException(String message) {
		super(message);
		
		String msg = getMessage();
		System.out.println(msg);
		System.out.println(getCause());
		System.out.println(getClass());
		
		System.out.println(getLocalizedMessage());
		System.out.println(getStackTrace().toString());
		System.out.println(getStackTrace().length);
	}

}
