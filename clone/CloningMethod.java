package com.te.clone;

public class CloningMethod implements Cloneable {

	int add(int a, int b) {
		return a + b;
	}

	int product(int a, int b) {
		return a * b;
	}

	int subst(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			throw new ArithmeticException("b value should not be greater ");
		}
	}

	int divide(int a, int b) {
		if (b > 0) {
			return a / b;
		} else {
			throw new ArithmeticException("b value should not be zero ");
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
