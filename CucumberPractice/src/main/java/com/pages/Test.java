package com.pages;

public class Test {

		int test_a=2, test_b=0;//not assigned any value
		Test(int a, int b)
		{
		test_a = a;
		test_b = b;
		}
		public static void main (String args[])
		{
		Test test = new Test(test_a, test_a);
		System.out.println(test.test_a+" "+test.test_b);
		}

	}


