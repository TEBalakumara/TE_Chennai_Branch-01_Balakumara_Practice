package com.te.practice.hashset;

import java.util.Scanner;
import java.util.TreeSet;

public class SortingMain {

	public static void main(String[] args) {

		System.out.println("enter 1 for sort by salary 2 for age 3 for name and 4 for Role ");
		Scanner scn = new Scanner(System.in);
		int opr = scn.nextInt();

		TreeSet<Employee> ref = null;
		switch (opr) {
		case 1:
			ref = new TreeSet<Employee>();
            break;
		case 2:
			ref = new TreeSet<Employee>(new SortByAge());
			 break;
		case 3:
			ref = new TreeSet<Employee>(new SortByName());
			 break;
		case 4:
			ref = new TreeSet<Employee>(new SortByRole());
			 break;

		default:
			System.out.println("Invalid");
		}

		if (ref != null) {
			ref.add(new Employee(50000, "Balakumara", "Engineer", 28));
			ref.add(new Employee(100000, "Vivek", "Senior Engineer", 23));
			ref.add(new Employee(150000, "Boopathy", "Lead Engineer", 25));
			ref.add(new Employee(75000, "Vicky", "Developer", 22));

			for (Employee employee : ref) {
				System.out.println(employee);
			}
		}

	}

}
