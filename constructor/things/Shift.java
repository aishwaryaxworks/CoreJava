package com.xworkz.constructor.things;

public class Shift {
	public String time;
	public String batch;
	public int members;
	public int staff;
	public boolean breaks;
	public String location;
	
	//default constructor
	public Shift() {
		System.out.println("This is default constructor.");
	}
	
	//parameterized constructor
	public Shift(String time, String batch, int members, int staff, boolean breaks, String location) {
		System.out.println("Parameterized Constructor.");
		this.time = time;
		this.batch = batch;
		this.members = members;
		this.staff = staff;
		this.breaks = breaks;
		this.location = location;
	}
	
	public void displayStaff() {
		System.out.println("Time:"+this.time+", Batch:"+this.batch+", Members:"+this.members+", "
				+ "Staff:"+this.staff+", Breaks:"+this.breaks+", Location"+this.location);
		
	}

}
