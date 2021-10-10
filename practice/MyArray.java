package com.te.practice;

public class MyArray {
	int index = 0;
	int default_capacity = 5;
	int arr[];

	public MyArray() {
		arr = new int[default_capacity];
	}

	public MyArray(int initsize) {
		arr = new int[initsize];
	}

	public boolean add(int element) {
		if (index < arr.length) {
			arr[index++] = element;
		} else {
			int[] arr2 = new int[arr.length + (arr.length >> 1)];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
			arr[index++] = element;
		}
		return true;
	}

	public void remove(int pos) {
		int n = arr.length - pos - 1;
		for (int i = pos; i < n; i++) {
			arr[i] = arr[i + 1];
		}
		index--;
	}

	public int getIndex(int pos) {
		return arr[pos];
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("[");
		for (int i = 0; i < index - 1; i++) {
			str.append(arr[i] + ",");
		}
		str.append(arr[index - 1] + "]");
		return str.toString();
	}

}
