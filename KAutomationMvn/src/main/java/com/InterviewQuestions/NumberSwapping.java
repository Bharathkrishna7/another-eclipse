package com.InterviewQuestions;

public class NumberSwapping {
	public static void main(String[] args) {

		int x = 100;
		int y = 200;
		int temp;
        
		temp=x; 
		x = y; 
		y= temp; 

		System.out.println("value of x= " + x);
		System.out.println("value of y= " + y);
				
	}

}