package com.aohys.exception;

/**
 * exception class for naming not found errors
 */
public class PostNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1226439803994500725L;

	public PostNotFoundException(String msg){
		super(msg);
	}
	
}
