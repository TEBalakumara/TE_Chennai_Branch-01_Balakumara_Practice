package com.te.collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArList {

	public static void main(String[] args) {
		ArrayList<Integer> ref=new ArrayList<Integer>();
		
		ref.add(10);
		ref.add(12);
		ref.add(9);
		ref.add(30);
		ref.add(34);
		
		
		Iterator itr=ref.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for (Integer integer : ref) {
			System.out.println(integer);
		}
		
		ListIterator<Integer> itr1=ref.listIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		
		ListIterator<Integer> itr2=ref.listIterator(ref.size());
		while (itr2.hasPrevious()) {
			System.out.println( itr2.previous());
			
		}
		
		for(int i=0;i<ref.size();i++) {
			System.out.println(ref.get(i));
		}
		

	}

}
