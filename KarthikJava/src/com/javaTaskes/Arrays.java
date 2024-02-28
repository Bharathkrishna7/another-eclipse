package com.javaTaskes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arrays {

	public static void main(String[] args) {
		
		Arrays ar=new Arrays();//Object to call non-Static methods
		ar.araayli();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		int favNum[] = new int[4];
		favNum[0]=92;
		favNum[1]=46;
		favNum[2]=18;
        favNum[3]=562;
		for (int f = 0; f < favNum.length; f++) {
			System.out.println("fav numbers are " + favNum[f]);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		String[]s=new String[3];
		s[0]="bharath";
		s[1]="Radha";
		s[2]="krishna";
		
for(String name:s )
	System.out.println(name);
		
System.out.println("##############################");
 
//another way to use Array

		String[] favnames = { "park", "radha", "krishna" }; 
		/*
		 * // enhanced forloop for (String favename : favnames)
		 * 
		 * System.out.println("name of array "+favename);
		 */
		
		int i=0;
			while(i<favnames.length) {
				System.out.println(favnames[i]);
			i++;
			}
			
		}
	public void araayli() {
		
		List<String> al=new ArrayList<String>();
		
		al.add("radha");
		al.add("park min young");
		al.add("Suzy");
		al.add("Moon Chae-won");
		
		Iterator<String> it= al.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
	}
	

}
