package com.Opps.MultipleInheritance;

public class Parent extends GrandParent {

	int flates=2; //this was earned by Ramesh
	public void additionalProperty() {
		System.out.println("Ramesh having "+flates+" flates");	
	}
		
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.name="Ramesh"; //parent name Changing to Child name
		p.propertys();
	
		p.additionalProperty();
     	}
		
	}


