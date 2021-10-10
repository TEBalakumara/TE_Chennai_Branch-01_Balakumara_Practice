package com.te.practice.threads;

public class ThreadTwo extends Thread {
	
	@Override
	public void run() {
		int a = 1;
		int fact = 5;
		for (int i = 1; i <= fact; i++) {
			a = a * i;
		}

		System.out.println("The factorial of the number is " + " " + a);
	}
}
