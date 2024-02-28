package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Object> al=new ArrayList<Object>();
		al.add(22);
		al.add("krishna");
		al.add("bharath");
		al.add(7);
		
		//Enhanced forloop
   for(Object ob:al)
	System.out.println("List of values in array's are "+ob);
   
   System.out.println("================================================");
	
	//Basic forloop
   for(int i=0;i<al.size();i++)
	   System.out.println(al.get(i));
   
   System.out.println("================================================");
   
   //Iterator Loop
   
   //Here we are writing iterator and it's type &  Write iterator method
   Iterator<Object> it=al.iterator();
   while(it.hasNext())  //If there is a next value in a set of values 
	   System.out.println(it.next());//Printing that next value
   
	}

}
