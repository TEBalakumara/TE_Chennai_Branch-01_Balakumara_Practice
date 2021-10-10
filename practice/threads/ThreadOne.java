package com.te.practice.threads;

public class ThreadOne extends Thread {
	@Override
	public void run() {
		int base = 2;
		int exponent = 5;
		int a = 1;

		for (int i = 1; i <= exponent; i++) {
			a = a * base;
		}
		System.out.println("The power of the value is " + " " + a);
	}
}
