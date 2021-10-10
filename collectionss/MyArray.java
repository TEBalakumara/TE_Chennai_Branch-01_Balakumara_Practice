package com.te.collectionss;

public class MyArray {
	private int default_size = 5;
	int arr[];
	private int index = 0;

	public MyArray() {
		arr = new int[default_size];
	}

	public MyArray(int initsize) {
		arr = new int[initsize];
	}

	public boolean add(int element) {
		if (index < arr.length) {
			arr[index++] = element;
		} else {
			int arr2[] = new int[arr.length + (arr.length >> 1)];
			for (int i = 0; i < arr.length; i++) {
				arr2[i] = arr[i];
			}
			arr = arr2;
			arr[index++] = element;
		}
		return true;
	}

	public int size() {
		return arr.length;
	}

	public int getValue(int index) {
		return arr[index];
	}

	public void remove(int pos) {
		int n = arr.length - pos - 1;
		for (int i = pos; i < n; i++) {
			arr[i] = arr[i + 1];
		}
		index--;

	}

	@Override
	public String toString() {
		StringBuilder ref = new StringBuilder("[");
		for (int i = 0; i < index - 1; i++) {
			ref.append(arr[i] + ",");
		}
		ref.append(arr[index - 1] + " ]");
		return ref.toString();

	}

}
