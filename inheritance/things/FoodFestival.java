package com.xworkz.inheritance.things;

public class FoodFestival extends Festival{
	protected String name;
	protected String location;
	protected int year;
	protected String[] foodVendors;
	
	public FoodFestival() {
		super();
		System.out.println("Food Festival-no argument constructor.");
	}

}
