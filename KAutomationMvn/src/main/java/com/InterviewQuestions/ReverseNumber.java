package com.InterviewQuestions;

public class ReverseNumber {

	public static void main(String[] args) {

		int rev = 0;
		int num = 8965;
		while (num != 0) {
			rev = rev * 10 + num % 10; // 0+5 60+6
			num = num / 10; // 896 89
		}
		System.out.println(rev);

		// 2nd way it will print down side

		int rev1;
		int num1 = 8965;
		while (num1 != 0) {
			rev1 = num1 % 10; // 5 6
			num1 = num1 / 10; // 896 89
			System.out.println(rev1);
		}

	}

}
