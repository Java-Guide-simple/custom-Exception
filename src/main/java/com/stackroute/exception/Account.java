package com.stackroute.exception;

public class Account {

	private double balance = 0;

	public Account() {

	}

	public Account(double balance) {
		this.balance = balance;
	}

	public void setAccountBalance(double submit) {
		this.balance += submit;
	}

	public double getAccountBalance() {
		return this.balance;
	}

	public double Withdraw(double withdrawableAmount) {

		return this.balance - withdrawableAmount;
	}
}
