package com.te.practice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployMain {

	public static void main(String[] args) {
		
		ArrayList<Employ> ref=new ArrayList<Employ>();
		
		ref.add(new Employ(50, "Bala"));
		ref.add(new Employ(10, "Rama"));
		ref.add(new Employ(30, "Revathi"));
		ref.add(new Employ(40, "Prem"));
		ref.add(new Employ(60, "Rajesh"));
		
		Collections.sort(ref);
		
		for (Employ employ : ref) {
			System.out.println(employ);
		}

	}

}
