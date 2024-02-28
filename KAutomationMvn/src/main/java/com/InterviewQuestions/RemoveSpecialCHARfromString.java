package com.InterviewQuestions;

public class RemoveSpecialCHARfromString {

	public static void main(String[] args) {
		
		String s = "0@*)+!bhartah7 )&^@!krishna7";
		String replace = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replace);
		
	
	}
	
	
}


