package com.te.sorting;

import java.util.Comparator;

public class SortByRole  implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getRole().compareTo(o2.getRole());
	}

	

}
