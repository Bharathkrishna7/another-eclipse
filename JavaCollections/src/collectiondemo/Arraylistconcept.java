package collectiondemo;

import java.util.ArrayList;


public class Arraylistconcept {

	public static void main(String[] args) { 
	
		int a[]=new int[2]; //Static array--size is fixed
		a[0]=6;//0
		a[1]=2;//1
		System.out.println(a.length);
		System.out.println("**************");
		
		/*dynamic array---- Array list
		 ==>in array list duplicate values are allowed
		 ==>It maintains insertion order means(index) */	
		
		ArrayList<Object> ar=new ArrayList<Object>(); //this all are non-generic array list values
		ar.add(2);//0
		ar.add(6);//1
		ar.add(9);//2
		ar.add(2);//3
		ar.add("krishna");//4
		ar.add('e');//5
		System.out.println(ar.size());//It shows size of array list
		
		System.out.println(ar.get(2));//it get's the value from index
		
		/* to print all the values from arraylist:-
		  ==> use forloops 0r
		  ==> use iterator
		*/
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>(); // this is generic arrylist,here we can only store int values..
		ar1.add(2);//0
		ar1.add(8);//1
		ar1.add(0);//2
		
		
		//printing by using forloop
		for(int j=0;j<ar1.size();j++) {
			System.out.println(ar1.get(j));
		}
		System.out.println("###################");
		//printing by using foreach
		ar1.forEach(in->{
			System.out.println(in);
		});
	

	}
	}
