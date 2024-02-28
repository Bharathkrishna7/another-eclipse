package javaInterviewPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="bharath247687909$&*(*^%$^_)krishna";

		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
