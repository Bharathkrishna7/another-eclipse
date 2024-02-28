package com.Opps.MultipleInheritance;

public class GrandParent {
    
	String name="krishna";
	String surName="Gali";
	double bankbal=5200000.52;
	double lands=5.4;
	int cars=2;
	int houses=2;
	
	public void propertys() {
		System.out.println("Name of the person is "+name);
		System.out.println("SurName of the person is "+surName);
		System.out.println("bankbalance of the person "+bankbal);
		System.out.println(name+" is having "+lands+" acres of land");
		System.out.println("Having cars:- "+cars);
		System.out.println("He have "+houses+" Houses");
	}
	
	public static void main(String[] args) {
		
		GrandParent ip=new GrandParent();
		ip.propertys();
	}

}
