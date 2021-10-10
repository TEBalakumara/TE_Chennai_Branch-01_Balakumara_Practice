package com.te.practice;

public class MyMain {

	public static void main(String[] args) {
		MyArray ref=new MyArray(6);
		
		System.out.println(ref.add(50));
		System.out.println(ref.add(20));
		System.out.println(ref.add(40));
		System.out.println(ref.add(80));
		System.out.println(ref.add(80));
		System.out.println(ref.add(100));
		System.out.println(ref.add(47));
		System.out.println(ref.add(57));
		
		System.out.println(ref);
		
		ref.remove(0);
		ref.remove(4);
		ref.remove(2);
		
		System.out.println(ref);

	}

}
