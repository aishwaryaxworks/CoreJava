package com.xworkz.assignments.things;

public class Apartment {
	public String name;
	public int bedrooms;
	public int bathrooms;
	public String location;
	public double rent;
	
	//default constructor
	public Apartment() {
		System.out.println("------Default Constructor.-----");
	}

	//parameterized constructor
	public Apartment(String name, int bedrooms, int bathrooms, String location, double rent) {
		System.out.println("-----Parameterized Constructor.-----");
		this.name = name;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.location = location;
		this.rent = rent;		
	}

	public void displayApartment() {
		System.out.println("Name:"+this.name+", Bedrooms:"+this.bedrooms+", Bathrooms:"+this.bathrooms+
				", Location:"+this.location+", Rent:"+this.rent);
	}
}
