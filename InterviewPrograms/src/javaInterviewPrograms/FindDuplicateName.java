package javaInterviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateName {

	public static void main(String[] args) {
	String names[]= {"java","selenium","python","java","ruby","ruby"};
	
	for(int i=0;i<names.length;i++) {
		for(int j=i+1;j<names.length;j++) {
			if(names[i].equals(names[j])) {
				System.out.println("duplicate name is: "+names[i]);
			}
		}
	}
	
	Set<String> store=new HashSet<String>();
	for(String name:names) {
		if(store.add(name) == false) {
			System.out.println("duplicate language is: "+name);
		}
	}
	

	}

}	
