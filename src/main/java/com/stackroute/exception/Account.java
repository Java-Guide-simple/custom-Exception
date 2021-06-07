package com.stackroute.exception;

public class Account {

	private int balance = 0;

	// Account object should be created with zero initial balance
	public Account() {

	}

	// "Account object should be created with the given balance using parameterized constructor";
	public Account(int balance) {
		this.balance = balance;
	}

	// Deposit money in Account
	public void setAccountBalance(int submit) {
		this.balance += submit;
	}

	// get available Balance 
	public int getAccountBalance() {
		return this.balance;
	}

	
	// Withdraw Money 
	public int withdraw(int withdrawableAmount) throws NegativeIntegerException, InsufficientFundException {

		// checking withdrawable amount is -ve or not
		if (withdrawableAmount < 0) {
			throw new NegativeIntegerException();
		}
		// checking withdrawable amount is greater than available balance
		if (withdrawableAmount > this.balance) {
			throw new InsufficientFundException();
		}
		
		// checking withdrawable amount is less than available balance
		if (withdrawableAmount < this.balance) {

			int newBalence = this.balance - withdrawableAmount;
			System.out.println(newBalence);
			return newBalence;
		}

		return this.balance;

	}
}
