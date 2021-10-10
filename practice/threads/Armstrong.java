package com.te.practice.threads;

public class Armstrong {
	
	public int digits(int x) {
		int digit = 0;
		do {
			digit++;
			x = x / 10;
		} while (x > 0);

		return digit;
	}

	public synchronized void getArmstrong(int num) {
		int val;
		int t;
		final int cp = num;
		int sum = 0;
		val = digits(cp);

		while (num > 0) {
			t = num % 10;
			int a = 1;
			for (int i = 1; i <= val; i++) {
				a = a * t;
			}

			sum = sum + a;
			num = num / 10;

		}

		String str = (sum == cp) ? "Armstrong Number" : "Not an Armstrong Number";
		System.out.println(cp+" "+"is"+" "+str);
	}
}
