package com.te.practice;

public class Employ2 implements Comparable<Employ2> {
	private int salary;
	private String Name;
	private String Role;
	private int age;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employ2 [salary=" + salary + ", Name=" + Name + ", Role=" + Role + ", age=" + age + "]";
	}

	public Employ2(int salary, String name, String role, int age) {
		super();
		this.salary = salary;
		Name = name;
		Role = role;
		this.age = age;
	}

	@Override
	public int compareTo(Employ2 o) {
		// return this.age-o.age;
		// return o.age-this.age;
		return this.getName().compareTo(o.getName());
		//return this.getRole().compareTo(o.getRole());
	}

}
