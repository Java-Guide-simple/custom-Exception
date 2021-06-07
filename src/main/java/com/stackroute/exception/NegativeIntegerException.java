package com.stackroute.exception;

public class NegativeIntegerException extends Exception {

	public NegativeIntegerException() {
		System.out.println("Withdraw amount should be greater than Zero / Non -ve amount");
	}

}
