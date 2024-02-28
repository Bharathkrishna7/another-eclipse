package com.ArrayinterviewQues;

public class Larges_Element {

	public static void main(String[] args) {

		// Initialize array
		int a[] = new int[] { 25, 11, 7, 775, 556 };
		// Initialize max with first element of array.
		int max = a[0];  
		// Loop through the array
		for (int i = 0; i < a.length; i++) {
			// Compare elements of array with max
			if (max < a[i])
				max = a[i];
		}
		System.out.println("Largest element present in given array: " + max);

	}
	
}
