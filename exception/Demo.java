package com.te.exception;

import java.io.IOException;

public class Demo implements Cloneable {
	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		if (b > a) {
			throw new ArithmeticException();
		} else {
			return a - b;
		}
	}

	public int multply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) throws IOException {

		if (b > 0) {
			return a / b;
		} else {
			
			throw new IOException();
		}
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
