package com.te.exception;

import java.io.IOException;

public class ExampleMain {

	public static void main(String[] args) throws CustomException {

		Example ref = new Example();
		System.out.println(ref.sub(5, 8));
}
}