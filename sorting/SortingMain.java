package com.te.sorting;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class SortingMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("To sort by: Client-> 1, Name->2,Role->3,Salary->4 ");
		int opr = scn.nextInt();

		TreeSet<Employee> ref = null;

		switch (opr) {
		case 1:

			ref = new TreeSet<Employee>(new SortByClient());
			break;

		case 2:
			ref = new TreeSet<Employee>(new SortByName());
			break;
		case 3:
			ref = new TreeSet<Employee>(new SortByRole());
			break;
		case 4:
			ref = new TreeSet<Employee>(new SortBySalary());
			break;
		default:
			System.out.println("Wrong Option");

		}
		
		if(ref!=null) {
			ref.add(new Employee("Bala", "Engineer", 25000, "Unknown"));
			ref.add(new Employee("Rama", "Executive", 100000, "Keyem"));
			ref.add(new Employee("Revathi","Senior Accountant", 75000, "Oracle"));
			ref.add(new Employee("Prem", "Networker", 55000, "Bosch"));
			ref.add(new Employee("Rajesh", "Accountant", 40000, "Infosys"));
			
			for (Employee employee : ref) {
				System.out.println(employee);
			}

		}
	}

}
