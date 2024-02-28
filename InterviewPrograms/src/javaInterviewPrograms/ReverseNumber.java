package javaInterviewPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
	int num=6521;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10; //it will give laste num
		num=num/10; // it will remove laste num
	}
	System.out.println(rev);

	}
	

}
