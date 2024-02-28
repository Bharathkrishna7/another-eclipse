package com.javaTaskes;

public class Day5Practice {
	public static void main(String[] args) {
		//Task:-If length of Emp'ids & Names Matches,Print Emp'ids & Names details.
		
		int empid[] = new int[4];
		empid[0] = 7;
		empid[1] = 17;
		empid[2] = 27;
		empid[3] = 77;

		String empName[] = new String[4];
		empName[0] = "Radha";
		empName[1] = "park minyoung";
		empName[2] = "bharath";
		empName[3] = "krishna";

		if (empid.length == empName.length) {

			for (int i = 0; i < empid.length; i++) {
				System.out.println("Employee id is " + empid[i]);
			}
			System.out.println("-----------------------------------------");
			for (int n = 0; n < empName.length; n++) {
				System.out.println("Employee Name is  " + empName[n]);
			}

		}

		else {
			System.out.println("Can't Print empid's & Names");
		}

	}

}
