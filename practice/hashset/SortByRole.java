package com.te.practice.hashset;

import java.util.Comparator;

public class SortByRole implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.role.compareTo(o2.role);
	}

}
