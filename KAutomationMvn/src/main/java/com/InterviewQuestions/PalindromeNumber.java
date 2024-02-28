package com.InterviewQuestions;

public class PalindromeNumber {

	public static void main(String[] args) {

		int palnum = 6226;
		int rev =0;
		while (palnum != 0) {
			rev = rev * 10 + palnum % 10;
			palnum = palnum / 10;
		}
		System.out.println(rev+" rev of num");
		
		int palnum1=6226;
		
		if(palnum1==rev) {
			System.out.println(palnum1+" is palindromeNum");
		}
		else {
			System.out.println(palnum1+" is not palindromeNum");
		}

	}

}
