package com.javaPrograms;

public class Abstraction {
	public static void main(String[] args) {

		//bike ab = new bike();// we cannot create an object for abstract class
		//ab.race();
		bike ab = new truck();
		    ab.race();
		    ab.booster();
		    ab.bigStructure();
		    ab.selfclean();
	}
}

abstract class bike { // we can only write abstract methods in abstract class
    String s="sun";
	public void race() {//Abstract class can accept normal methods also
		System.out.println("racing..."+s);
	}

	public abstract void booster(); // Abstract method dont have body,just like "interface".

	public abstract void bigStructure();

	public abstract void selfclean();
}

abstract class car extends bike { 
	public void booster() {
		System.out.println("boosting....");
	}
}

class truck extends car {   //we call truck is an "concreat class".becase we are implementing the abstract methods.
	public void bigStructure() {
		System.out.println("bigone..");
	}

	public void selfclean() {
		System.out.println("cleaning..");
	}

}
