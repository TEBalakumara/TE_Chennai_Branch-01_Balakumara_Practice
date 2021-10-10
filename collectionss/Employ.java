package com.te.collectionss;

public class Employ implements Comparable<Employ> {
	
	String Name;
	int age;
	String role;
	int salary;

	public Employ(String name, int age, String role, int salary) {
		super();
		Name = name;
		this.age = age;
		this.role = role;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employ [Name=" + Name + ", age=" + age + ", role=" + role + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public int compareTo(Employ o) {
		//return 0;
		return this.Name.compareTo(o.Name);
	}

	
}
