package com.javaTaskes;

public class Day5task {

	public static void main(String[] args) {
		// Task(Using arrays & ifConditions):-If length of Emp'ids & Names Matches,
		// Print Emp'ids & Names details.

		int empid[] = new int[4];
		empid[0] = 7;
		empid[1] = 17;
		empid[2] = 27;
		empid[3] = 77;

		for (int i = 0; i < empid.length; i++) {
			System.out.println("Employee id is " + empid[i]);
		}
		String empName[] = new String[5];
		empName[0] = "Radha";
		empName[1] = "park";
		empName[2] = "minyoung";
		empName[3] = "bharath";
		empName[4] = "krishna";
		for (int n = 0; n < empName.length; n++) {
			System.out.println("Name of Employee is  " + empName[n]);
		}

		if (empid.length == empName.length) {

			System.out.println("Print empid's&Names");
		} else {
			System.out.println("Dont Print empid's&Names");
		}
	}

}