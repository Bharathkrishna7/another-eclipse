package com.javaPrograms;

public class Extendsinterface implements Interface  {

	public static void main(String[] args) {
		
		Extendsinterface ei= new Extendsinterface();
		ei.cycle();
		ei.zeep();
		ei.airoplane();

	}

	@Override
	public void cycle() {
		// TODO Auto-generated method stub
		System.out.println("having "+j+" cycles");
	}

	@Override
	public void zeep() {
		// TODO Auto-generated method stub
		System.out.println("zeep owner is "+g);
	}

	@Override
	public void airoplane() {
		// TODO Auto-generated method stub
		System.out.println("he have "+m+" airoplanes");
	}

}
