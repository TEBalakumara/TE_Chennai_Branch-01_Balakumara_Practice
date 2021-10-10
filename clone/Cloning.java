package com.te.clone;

public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee1 employee = new Employee1();
		employee.setEid(10);
		employee.setEname("Paul");
		employee.setRole("Developer");
		employee.setSalary(45000);

		System.out.println("Before Changes");

		Employee1 employee2 = null;

		System.out.println("Emp :" + employee);
		employee2 = (Employee1) employee.clone();
		System.out.println("Emp2 :" + employee2);

	}
}
