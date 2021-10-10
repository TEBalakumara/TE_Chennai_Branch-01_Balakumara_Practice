package com.te.practice.hashset;

public class Employee implements Comparable<Employee> {
	int salary;
	String name;
	String role;
	int age;

	public Employee(int salary, String name, String role, int age) {
		super();
		this.salary = salary;
		this.name = name;
		this.role = role;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", role=" + role + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.salary - o.salary;
//		return o.salary-this.salary;
//		return this.name.compareTo(o.name);
//		return o.name.compareTo(this.name);
//		return this.age-o.age;
//		return o.age-this.age;
		// return this.role.compareTo(o.role);
//		return o.role.compareTo(this.role);

	}

}
