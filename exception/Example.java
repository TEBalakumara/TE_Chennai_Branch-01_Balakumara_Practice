package com.te.exception;

import java.io.IOException;

public class Example {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) throws CustomException  {

		if(a>b) {
			return a-b;
		}else {
			
			throw new CustomException();
		}
	}

	public int multply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {

		return a / b;

	}
}
