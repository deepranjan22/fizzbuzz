package com.xyz.coding.trial;

public class FizzBuzzException extends Exception {

	private static final long serialVersionUID = 1L;

	public FizzBuzzException() {
		super();
	}

	public FizzBuzzException(String errorMsg) {
		super(errorMsg);
	}

	public FizzBuzzException(String errorMsg, Exception ex) {
		super(errorMsg, ex);
	}
}