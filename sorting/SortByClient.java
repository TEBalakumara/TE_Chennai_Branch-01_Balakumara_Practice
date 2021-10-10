package com.te.sorting;

import java.util.Comparator;

public class SortByClient implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getClient().compareTo(o2.getClient());
	}

}
