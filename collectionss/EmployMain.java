package com.te.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EmployMain {

	public static void main(String[] args) {
		Set<Employ> ref = new TreeSet();
		
		ref.add(new Employ("BALA", 17, "ENGINEER", 10000));
		ref.add(new Employ("VIVEK", 23, "DEVELOPER", 30000));
		ref.add(new Employ("VICKY", 31, "LEAD", 100000));
		ref.add(new Employ("AKASH", 25, "CEO", 10000000));
		ref.add(new Employ("BALA KRISHNA", 24, "PM", 1000));
		ref.add(new Employ("BOOPATHY", 17, "ENGINEER", 10000));
		
		
		
		ArrayList<Employ> ref1=new ArrayList(ref);
		
		Collections.sort(ref1);
		
		Iterator<Employ> itr=ref.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
