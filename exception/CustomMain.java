package com.te.exception;

import java.io.IOException;
import java.util.Scanner;

public class CustomMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int b = s.nextInt();
		CustExc ref = new CustExc();

		try {
			ref.getEven(b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}