package com.te.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> ref = new ArrayList<Employee>();

		Employee obj = new Employee();
		Employee obj1 = new Employee();
		Employee obj2 = new Employee();
		Employee obj3 = new Employee();
		Employee obj4 = new Employee();
		Employee obj5 = new Employee();

		obj.setName("BALA");
		obj.setSalary(8000);

		obj1.setName("Vivek");
		obj1.setSalary(800);

		obj2.setName("AKASH");
		obj2.setSalary(80000);

		obj3.setName("VICKY");
		obj3.setSalary(800000);

		obj4.setName("BOOPATHY");
		obj4.setSalary(8000000);

		obj5.setName("KAVIN");
		obj5.setSalary(8000000);

		// ref.add(new Employee("BALA",8000))
		ref.add(obj);
		ref.add(obj1);
		ref.add(obj2);
		ref.add(obj3);
		ref.add(obj4);
		ref.add(obj5);

		Iterator<Employee> ref1=ref.iterator();
		//while(ref1.hasNext()) {
		//	System.out.println(ref1.next());
	//	}
		
		System.out.println("==========before sort============");
		for (Employee employee : ref) {
			System.out.println(employee);
		}
		
		

	}

}
