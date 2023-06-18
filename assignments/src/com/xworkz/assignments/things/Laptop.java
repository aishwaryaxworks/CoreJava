package com.xworkz.assignments.things;

public class Laptop {
	public String brand;
	public String model;
	public double screenSize;
	public int RAM;
	public String operatingSystem;
	
	//default constructor
	public Laptop() {
		System.out.println("------Default Constructor.-----");
	}

	//parameterized constructor
	public Laptop(String brand, String model, double screenSize, int RAM, String operatingSystem) {
		System.out.println("-----Parameterized Constructor.-----");
		this.brand = brand;
		this.model = model;
		this.screenSize = screenSize;
		this.RAM = RAM;
		this.operatingSystem = operatingSystem;		
	}

	public void displayLaptop() {
		System.out.println("Brand:"+this.brand+", Model:"+this.model+", Screen Size:"+this.screenSize+
				", RAM:"+this.RAM+", OS:"+this.operatingSystem);
	}

}
