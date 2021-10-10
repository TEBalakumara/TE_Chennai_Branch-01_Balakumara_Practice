package com.te.practice.threads;

public class Power {
	
	public void getPower(int base, int exponent) {
		int a = 1;

		for (int i = 1; i <= exponent; i++) {
			a = a * base;
		}
		System.out.println("The power of the value is " + " " + a);
	}
}
