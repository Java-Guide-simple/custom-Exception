package com.stackroute.exception;

import java.util.Scanner;

// not required only for testing purpose i have have created
public class AccountMain {

	public static void main(String[] args) throws NegativeIntegerException, InsufficientFundException {
		// Create Account instance
		Account ac = new Account();

		Scanner scan = new Scanner(System.in);

		// deposit amount
		System.out.println("Enter you Deposit Amount ");
		int deposit = scan.nextInt();
		ac.setAccountBalance(deposit);

		// withdraw amount

		System.out.println("Enter Your withdrawable Amount");
		int withdrawAmount = scan.nextInt();
		ac.withdraw(withdrawAmount);

	}

}
