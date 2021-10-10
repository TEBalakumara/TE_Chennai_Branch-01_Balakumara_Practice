package com.te.clone;

import com.te.practice.Employee;

public class CloneTest {

	public static void main(String[] args) {

		Employee ref = new Employee(10, "Engineer", "Bala", 28);

		try {
			Employee ref1 = (Employee) ref.clone();
			System.out.println(ref1);
		
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
