package com.xworkz.inheritance.things;

public class Rapido {
	protected String driverName;
	protected String customerName;
	
	public Rapido() {
		super();
		//super("Sarvesh","Sagar");
		//this("Sarvesh","Sagar");
		System.out.println("Rapido no argument constructor.");
	}
	
	public Rapido(String driverName, String customerName) {
		System.out.println(driverName+ " " +customerName);
		System.out.println(this.driverName+ " " +this.customerName);
		this.driverName = driverName;
		this.customerName = customerName;
		System.out.println("Rapido all argument constructor.");
		System.out.println(driverName+ " " +customerName);
		System.out.println(this.driverName+ " " +this.customerName);
	}

	public void display() {
		System.out.println("Display available vehicle.");
	}
	
}
