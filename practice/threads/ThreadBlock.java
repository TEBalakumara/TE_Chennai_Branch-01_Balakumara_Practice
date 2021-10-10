package com.te.practice.threads;

public class ThreadBlock {

	public static void main(String[] args) {
		
		Power ref=new Power();
		
		Runnable obj=()->{
			synchronized (ref) {
				ref.getPower(2, 5);
			}
		};
		
		Runnable obj1=()->{
			synchronized (ref) {
				ref.getPower(2, 8);
			}
		};
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		
		t1.start();
		t2.start();

	}

}
