package com.ArrayinterviewQues;

public class Print_Even_and_Odd_numFromArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 8, 9, 8, 3, 2 };

		// get even numbers
		System.out.println("even numbers");
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {

				System.out.println(a[i]);
			}

		}

		// get odd numbers
		System.out.println("Odd numbers");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {

				System.out.println(a[i]);
			}
		}

	}

}
