package com.te.practice;

import java.util.HashSet;

public class HashEmploy {
	public static void main(String[] args) {
		HashSet<Employ2> ref = new HashSet();

		ref.add(new Employ2(10000, "Balakumara R", "Intern", 28));
		ref.add(new Employ2(20000, "Prem Kumar", "Networking", 28));
		ref.add(new Employ2(30000, "Vidhya", "Executive", 28));
		ref.add(new Employ2(40000, "Rajesh", "Accountant", 28));
		ref.add(new Employ2(50000, "Shiva", "Executive", 28));

	}
}
