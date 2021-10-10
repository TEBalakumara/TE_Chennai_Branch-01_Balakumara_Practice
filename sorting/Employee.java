package com.te.sorting;

public class Employee  {
	private String Name;

	private String role;

	private int salary;

	private String client;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSalary() {
		return salary;
	}

	public Employee(String name, String role, int salary, String client) {
		super();
		Name = name;
		this.role = role;
		this.salary = salary;
		this.client = client;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", role=" + role + ", salary=" + salary + ", client=" + client + "]";
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	
}
