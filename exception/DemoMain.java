package com.te.exception;

import java.io.IOException;

public class DemoMain {

	public static void main(String[] args) throws IOException {

		Demo ref = new Demo();

		ref.divide(5, 0);
		
		
	}
}