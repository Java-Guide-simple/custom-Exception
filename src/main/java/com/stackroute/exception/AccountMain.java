package com.stackroute.exception;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// Create Account instance
		Account ac = new Account();
		// deposit amount
		ac.setAccountBalance(5000);
		Scanner scan = new Scanner(System.in);
		// withdraw amount
		System.out.println("Enter Your withdrawable Amount");
		double withdrawAmount = scan.nextDouble();
		double availableBalance = ac.getAccountBalance();
		if (availableBalance > 0) {
			try {
				if (withdrawAmount < 0) {
					throw new NegativeIntegerException();
				}
				if (withdrawAmount > availableBalance) {
					throw new InsufficientFundException();
				}
				if (withdrawAmount < availableBalance) {
					double newBalance = ac.Withdraw(withdrawAmount);
					System.out.println(newBalance);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
