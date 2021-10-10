package com.te.exception;

import java.io.IOException;

public class CustExc {
	void getEven(int a) {
		if (a % 2 == 0) {
			System.out.println("Accepted");
		} else {
			throw new ArithmeticException("Odd numbers not accepted ");
		}
	}
}
