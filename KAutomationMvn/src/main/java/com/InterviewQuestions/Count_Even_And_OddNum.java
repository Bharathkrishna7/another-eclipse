package com.InterviewQuestions;

public class Count_Even_And_OddNum {

	public static void main(String[] args) {

		int num = 972459212;
		int even_num = 0;
		int odd_num = 0;

		while (num > 0) {
			int rem = num % 10; // div with module  give us laste num 
			if (rem % 2 == 0) {
				even_num++;
			} else {
				odd_num++;
			}
			num = num / 10; // it will remove laste num
		}
		System.out.println("total num of even numbers: " + even_num);
		System.out.println("total num of odd numbers: " + odd_num);
		

	}

}
