package com.te.collectionss;

import java.util.Set;
import java.util.TreeSet;

public class TreSet {
	public static void main(String[] args) {
		Set<Integer> ref = new TreeSet();

		ref.add(12);
		ref.add(20);
		ref.add(21);
		ref.add(15);
		ref.add(16);
		ref.add(17);

		for (Object object : ref) {
			System.out.println(object);
		}
		
		
		
	}
}
