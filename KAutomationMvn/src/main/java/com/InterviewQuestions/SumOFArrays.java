package com.InterviewQuestions;

public class SumOFArrays {

	public static void main(String[] args) {
		
		int a[]= {2,8,6,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of arrays are: "+sum);	
	
		//print total numbers
		for(int i=0;i<a.length;i++) {
			System.out.println("total numbers "+a[i]);
		} 
		
		
	}
	

}
 