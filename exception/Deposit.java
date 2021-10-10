package com.te.exception;

import java.util.Scanner;

public class Deposit {

	public static void main(String[] args) {

		System.out.println("Enter the amount ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		DepositMethod ref = new DepositMethod();
        
		try {
		ref.deposit(a);
		}catch(InstantiationException e) {
			System.out.println(e.getMessage());
		}
	}

}
