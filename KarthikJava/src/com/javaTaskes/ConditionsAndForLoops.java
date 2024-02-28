package com.javaTaskes;

public class ConditionsAndForLoops {

	public static void main(String[] args) {

		/*
		 * if conditions Student rank is in between 1-6000(svu) Student rank is in
		 * between 6000-15000(svce)
		 */
		int rank = 7777;
		if (rank >= 1 && rank <= 6000)
			System.out.println("Selected for svu rank= " + rank);
		else if (rank < 1)
			System.out.println("rank should be abouv 1= " + rank);
		else if (rank > 15000)
			System.out.println("rank should be below 15000= " + rank);
		else
			System.out.println("Selected for svce= " + rank);

		// Ternary operations for "if conditions"
		rank = 77; // Here rank is updating bec we are not using dataTypes
		String result = (rank <= 6000) ? "svu" : "svce";// Here if else are writen in one line but we don't see them
		System.out.println("Student selected for " + result + "=" + rank);

		// Print eligible to vote 18+ using ternary operator

		int age = 8;
		String vote = (age >= 18) ? "Eligible to vote" : "not eligible to vote";
		System.out.println(vote);
//For loops
		// print numbers b/w 1 to 20

		for (int i = 2; i < 20; i++) {

			System.out.println(i);
 }
		
		

	}

}
