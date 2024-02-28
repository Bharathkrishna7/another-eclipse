package com.InterviewQuestions;

public class PrimeNumber {
// a number is divisible by "1 and itself" is called prime number
	public static void main(String[] args) {
		int n = 7;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		System.out.println(prime);

	}

}
