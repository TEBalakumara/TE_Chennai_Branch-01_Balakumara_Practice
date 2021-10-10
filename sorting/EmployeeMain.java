package com.te.sorting;

import java.util.TreeSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		TreeSet<Employee> ref=new TreeSet<>();
		ref.add(new Employee("Bala", "Engineer", 25000, "Unknown"));
		ref.add(new Employee("Rama", "Executive", 100000, "Keyem"));
		ref.add(new Employee("Revathi","Senior Accountant", 75000, "Oracle"));
		ref.add(new Employee("Prem", "Networker", 55000, "Bosch"));
		ref.add(new Employee("Rajesh", "Accountant", 40000, "Infosys"));

	}

}
