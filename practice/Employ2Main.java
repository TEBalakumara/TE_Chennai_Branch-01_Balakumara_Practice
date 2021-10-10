package com.te.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Employ2Main {
public static void main(String[] args) {
	
	List<Employ2> ref=new ArrayList();
	ref.add(new Employ2(25000, "Bala", "Engineer", 28));
	ref.add(new Employ2(75000, "Rama", "Engineer", 62));
	ref.add(new Employ2(25000, "Revathi", "Economist", 58));
	ref.add(new Employ2(25000, "Prem", "Networking", 31));
	
	Collections.sort(ref);
	
	Iterator<Employ2> itr=ref.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
		
	}
}
}
