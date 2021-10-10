package com.te.practice.threads;

public class RunnableMain {

	public static void main(String[] args) {
		
		Runnable ref=()->{
			int base = 2;
			int exponent = 5;
			int a = 1;

			for (int i = 1; i <= exponent; i++) {
				a = a * base;
			}
			System.out.println("The power of the value is " + " " + a);
		};
		
		Runnable ref1=()->{
			int a = 1;
			int fact = 5;
			for (int i = 1; i <= fact; i++) {
				a = a * i;
			}

			System.out.println("The factorial of the number is " + " " + a);
		};
		
		Thread obj=new Thread(ref);
		Thread obj1=new Thread(ref1);
		
		obj.start();
		obj1.start();
	}

}
