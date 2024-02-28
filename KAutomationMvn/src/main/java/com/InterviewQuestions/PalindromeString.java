package com.InterviewQuestions;

public class PalindromeString {

	public static void main(String[] args) {

		String pal = "abba";
		String rev = "";
		int len = pal.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + pal.charAt(i);
		}
		if (pal.equals(rev)) {
			System.out.println(pal + " is palindrom");
		} else {
			System.out.println(pal + " is not palindrome");
		}

	}

}
