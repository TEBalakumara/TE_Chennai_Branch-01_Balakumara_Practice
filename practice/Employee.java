package com.te.practice;

public class Employee implements Comparable<Employee>,Cloneable {
	private int id;
	private String role;
	private String Name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Role=" + role + ", Name=" + Name + ", age=" + age + "]";
	}

	public Employee(int id, String role, String name, int age) {
		super();
		this.id = id;
		this.role = role;
		Name = name;
		this.age = age;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

	@Override
	public int hashCode() {
		return this.id;
	}


	@Override
	public int compareTo(Employee o) {
		//return this.age - o.age;
		return o.age - this.age;
		 // return this.getName().compareTo(o.getName());
	}

}
