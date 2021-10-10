package com.te.practice;

public class EmployeeTreeSet implements Comparable<EmployeeTreeSet> {
	private int salary;
	private String Name;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	@Override
	public String toString() {
		return "EmployeeTreeSet [salary=" + salary + ", Name=" + Name + "]";
	}

	@Override
	public int compareTo(EmployeeTreeSet o) {
		// return o.salary-this.salary;
		return this.getName().compareTo(o.getName());
	}

}
