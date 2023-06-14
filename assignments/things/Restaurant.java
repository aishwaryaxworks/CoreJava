package com.xworkz.assignments.things;

public class Restaurant {
	public String name;
	public String cuisine;
	public String address;
	public int capacity;
	public double rating;
	
	//default constructor
	public Restaurant() {
		System.out.println("------Default Constructor.-----");
	}

	//parameterized constructor
	public Restaurant(String name, String cuisine, String address, int capacity, double rating) {
		System.out.println("-----Parameterized Constructor.-----");
		this.name = name;
		this.cuisine = cuisine;
		this.address = address;
		this.capacity = capacity;
		this.rating = rating;		
	}

	public void displayRestaurant() {
		System.out.println("Restaurant name:"+this.name+", Cuisine name:"+this.cuisine+", "
				+ ", Address:"+this.address+", Capacity:"+this.capacity+", Rating:"+this.rating);
	}
}
