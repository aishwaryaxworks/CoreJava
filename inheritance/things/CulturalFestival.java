package com.xworkz.inheritance.things;

public class CulturalFestival extends Festival {

	protected String name;
	protected String location;
	protected int year;
	protected String[] culturalPerformances;
	
	public CulturalFestival() {
		super();
		System.out.println("Cultural Festival-no argument constructor.");
	}
	
}
