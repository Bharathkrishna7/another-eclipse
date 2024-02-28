package com.Opps.MultipleInheritance;

public class GrandParentEncaptulation extends GrandParentEncaptulationDetails {

	public static void main(String[] args) {

		GrandParentEncaptulation ge = new GrandParentEncaptulation();

		/*
		 * First way of giving data in Encaptulation ge.setName("bharath");
		 * ge.setSurName("krishna"); ge.setBankbal(200000); ge.setLands(4.5);
		 * ge.setCars(2); ge.setHouses(2);
		 */

		// second way is by storing variables values in Array String form

		/*
		 * ge.setName(args[0]); ge.setSurName(args[1]); double
		 * bl=Double.parseDouble(args[2]); ge.setBankbal(bl); double
		 * lan=Double.parseDouble(args[3]); ge.setLands(lan); int
		 * car=Integer.parseInt(args[4]); ge.setCars(car); int
		 * house=Integer.parseInt(args[5]); ge.setHouses(house);
		 */

		// 3rd way by using vm args values stored in system

		ge.setName(System.getProperty("name"));
		ge.setSurName(System.getProperty("surname"));
		double bl = Double.parseDouble(System.getProperty("bankbal"));
		ge.setBankbal(bl);
		double lan = Double.parseDouble(System.getProperty("land"));
		ge.setLands(lan);
		int car = Integer.parseInt(System.getProperty("cars"));
		ge.setCars(car);
		int house = Integer.parseInt(System.getProperty("house"));
		ge.setHouses(house);

		System.out.println("Name of the person is " + ge.getName());
		System.out.println("SurName of the person is " + ge.getSurName());
		System.out.println("bankbalance of the person " + ge.getBankbal());
		System.out.println(ge.getName() + " is having " + ge.getLands() + " acres of land");
		System.out.println("Having cars:- " + ge.getCars());
		System.out.println("He have " + ge.getHouses() + " Houses");

	}

}
