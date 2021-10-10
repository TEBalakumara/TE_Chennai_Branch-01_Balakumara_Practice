package com.te.collectionss;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayReverse {

	public static void main(String[] args) {
		 int arr[]= {1,2,3,4,5,6,6,7};
		 
		LinkedHashSet<Integer> ref=new LinkedHashSet<Integer>();
		 for(int i=arr.length-1;i>=0;i--) {
			ref.add(arr[i]); 
			
		 }
		 
		 System.out.println(ref);
	}

}
