package com.xworkz.assignments.things;

public class Car {
	public String make;
	public String model;
	public int year;
	public String color;
	public int mileage;
	
	//default constructor
	public Car() {
		System.out.println("------Default Constructor.-----");
	}
	
	//parameterized constructor
	public Car(String make, String model, int year, String color, int mileage) {
		System.out.println("-----Parameterized Constructor.-----");
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;		
	}
	
	public void displayCar() {
		System.out.println("Car made by:"+this.make+", Model:"+this.model+", Made "
				+ "in year:"+this.year+", Car color:"+this.color+", Gives mileage:"+this.mileage);
	}

}
