package com.te.collectionss;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class ArrList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ref=new ArrayList();
		 
		 ref.add(11);
		 ref.add(12);
		 ref.add(10);
		 
		 
		 System.out.println("=========iteratotr==========");
		 
		 Iterator<Integer> itr=ref.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 
		 System.out.println("=========foreach==========");
		 
		for (Integer integer : ref) {
			System.out.println(integer);
		}
		 
		 System.out.println("=======get()============");
		 for(int i=0;i<ref.size();i++) {
			 System.out.println(ref.get(i));
		 }
		 Collections.sort(ref);
		 System.out.println(ref);
	}

}
