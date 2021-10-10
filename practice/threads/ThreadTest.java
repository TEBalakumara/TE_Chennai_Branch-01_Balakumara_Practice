package com.te.practice.threads;

public class ThreadTest {

	public static void main(String[] args) {
		
		Armstrong ref=new Armstrong();
		
		Runnable obj=()->{
			
			ref.getArmstrong(153);
		};
		
		Runnable obj2=()->{

			ref.getArmstrong(1634);
		};
		
		Runnable obj3=()->{
			
			ref.getArmstrong(142);
		};
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
