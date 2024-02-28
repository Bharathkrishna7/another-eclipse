package javaInterviewPrograms;

public class ReverseString {

	public static void main(String[] args) {

		String s = "krishna"; //here total char is '6' bec index starts with '0'.. 
		int len = s.length(); // 7
		String rev = "";
		for (int i = len - 1; i >= 0; i--) { //7-1;condition satisfied
			rev = rev + s.charAt(i);   //"charAt" will give the value of specific index. { +a}{an}e.t.c 
		//	System.out.println(rev);
		}
		System.out.println(rev);

	//==================================================================	
		//2.//Using String buffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
	}

}
