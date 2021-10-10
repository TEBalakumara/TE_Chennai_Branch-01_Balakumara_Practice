package com.te.collectionss;

public class MyMain {

	public static void main(String[] args) {
		
		MyArray ref=new MyArray(5);
		System.out.println(ref.size());
		System.out.println(ref.add(5));
		System.out.println(ref.add(5));
		System.out.println(ref.add(50));
		System.out.println(ref.add(54));
		System.out.println(ref.add(52));
		System.out.println(ref.add(78));
		System.out.println(ref.add(56));
		System.out.println(ref.add(41));
		System.out.println(ref.add(587));
		
		System.out.println(ref);
		ref.remove(0);
		System.out.println(ref);
        
	}

}
