package com.xworkz.constructor.things;

public class Irctc {
	// literal way of assigning values to variables 
	public String name="Sarvesh";
	public int price=550;
	public String seatNumber="D12";
	public String location="Vijayapur";
	
	public Irctc() {
		System.out.println("No argument constructor.");
		System.out.println("Name:"+name);
	}
	
	//assigning values to variables using constructor
	public Irctc(String name, int price, String location, String seatNumber) {
		System.out.println("All argument constructor.");
		this.name=name;
		this.price=price;
		this.location=location;
		this.seatNumber=seatNumber;
	}
	
	//using setter method to assign values
	public void setName(String name) {
		this.name=name;
	}
	//using getter method to retrieve values
	public String getName() {
		return this.name;
	}

}
