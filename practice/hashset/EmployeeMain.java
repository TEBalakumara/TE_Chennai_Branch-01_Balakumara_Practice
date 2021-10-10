package com.te.practice.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class EmployeeMain {

	public static void main(String[] args) {

		HashSet<Employee> ref = new HashSet<Employee>();

		ref.add(new Employee(50000, "Balakumara", "Engineer", 28));
		ref.add(new Employee(100000, "Vivek", "Senior Engineer", 23));
		ref.add(new Employee(150000, "Boopathy", "Lead Engineer", 25));
		ref.add(new Employee(75000, "Vicky", "Developer", 22));

		System.out.println("========before sorting=============");
		for (Employee employee : ref) {
			System.out.println(employee);
		}

		ArrayList<Employee> ref1 = new ArrayList<Employee>(ref);
		Collections.sort(ref1);

		System.out.println("===========after sorting==============");
		for (Employee employee1 : ref1) {
			System.out.println(employee1);
		}

	}

}
