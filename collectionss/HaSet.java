package com.te.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HaSet {

	public static void main(String[] args) {
		
		Set<Integer> ref=new HashSet<Integer>();
		
		ref.add(12);
		ref.add(18);
		ref.add(24);
		ref.add(30);
		ref.add(45);
		
		
		for (Object object : ref) {
			System.out.println(object);
		}
		
		List ref1=new ArrayList(ref);
		
		Collections.sort(ref1);
		
		for (Object object : ref1) {
			System.out.println(object);
		}
		
		
		
	}

}
