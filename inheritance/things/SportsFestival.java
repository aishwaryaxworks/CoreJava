package com.xworkz.inheritance.things;

public class SportsFestival extends Festival {
	protected String name;
	protected String location;
	protected int year;
	protected String[] sportsEvents;

	public SportsFestival() {
		super();
		System.out.println("Sports festival-no argument constructor.");
	}

}
