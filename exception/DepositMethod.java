package com.te.exception;

public class DepositMethod {
	int balance = 10000;

	void deposit(int amount) throws InstantiationException {
		if (amount >= 500) {
			balance += amount;
			System.out.println("The amount in your account is "+" "+balance);
		} else {
			throw new InstantiationException("amount less than 500 not allowed");
		}

	}
}
