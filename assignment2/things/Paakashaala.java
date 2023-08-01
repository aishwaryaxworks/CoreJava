package com.xworkz.assignment2.things;

public abstract class Paakashaala {

	public String name;
	public String location;
	public int yearFounded;
	public int numberOfBranches;

	// Constructors
	public Paakashaala() {
		System.out.println("Paakashaala-no argument constructor.");
	}

	public Paakashaala(String name, String location, int yearFounded, int numberOfBranches) {
		this.name = name;
		this.location = location;
		this.yearFounded = yearFounded;
		this.numberOfBranches = numberOfBranches;
		System.out.println("Paakashaala-all argument constructor");
	}

	// Concrete methods
	public void displayInfo() {
		System.out.println("Restaurant Name: " +this.name);
		System.out.println("Location: " + this.location);
		System.out.println("Year Founded: " + this.yearFounded);
		System.out.println("Number of Branches: " + this.numberOfBranches);
	}

	public void greetCustomers() {
		System.out.println("Welcome to "+this.name+" restaurant!");
	}

	public void serveFood() {
		System.out.println("Your delicious South Indian vegetarian food is served!");
	}

	public void collectFeedback() {
		System.out.println("Please provide your valuable feedback!");
	}

	// Abstract methods
	public abstract void displayMenu();
	public abstract void takeOnlineOrders();
	public abstract void offerHomeDelivery();
}


