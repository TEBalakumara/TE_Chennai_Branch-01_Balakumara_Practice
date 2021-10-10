package com.te.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class EmployeeAmin {
	public static void main(String[] args) {
		HashSet<Employee> ref = new HashSet();

		ref.add(new Employee(10, "Engineer", "Balakumara", 28));
		ref.add(new Employee(20, "Intern", "Hari", 22));
		ref.add(new Employee(30, "Networking", "Prem", 31));
		ref.add(new Employee(40, "Tester", "Ramaselvamani", 22));
		ref.add(new Employee(50, "Engineer", "Rasheed", 25));
		
		Iterator<Employee> itr=ref.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
        
		ArrayList<Employee> obj=new ArrayList<Employee>(ref);
		Collections.sort(obj);
		
		Iterator<Employee> it=obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
