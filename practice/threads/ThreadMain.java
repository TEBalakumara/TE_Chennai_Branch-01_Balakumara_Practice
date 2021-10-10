package com.te.practice.threads;

public class ThreadMain {

	public static void main(String[] args) {

		ThreadOne ref = new ThreadOne();
		ThreadTwo ref1 = new ThreadTwo();

		ref.start();
		ref1.start();
	}

}
