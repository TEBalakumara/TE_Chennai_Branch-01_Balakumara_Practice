package com.te.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
		TreeSet<EmployeeTreeSet> ref=new TreeSet();
		
		EmployeeTreeSet obj=new EmployeeTreeSet();
		obj.setName("Bala");
		obj.setSalary(50000);
		
		EmployeeTreeSet obj2=new EmployeeTreeSet();
		obj2.setName("Kumara");
		obj2.setSalary(60000);
		
		EmployeeTreeSet obj3=new EmployeeTreeSet();
		obj3.setName("Rama");
		obj3.setSalary(70000);
		
		EmployeeTreeSet obj4=new EmployeeTreeSet();
		obj4.setName("Revathi");
		obj4.setSalary(80000);
		
		ref.add(obj);
		ref.add(obj2);
		ref.add(obj3);
		ref.add(obj4);
		
	
		Iterator<EmployeeTreeSet> itr=ref.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
