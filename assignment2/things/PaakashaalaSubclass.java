package com.xworkz.assignment2.things;

public class PaakashaalaSubclass extends Paakashaala{
	// Constructors
	public PaakashaalaSubclass() {
		super();
	}

	public PaakashaalaSubclass(String name, String location, int yearFounded, int numberOfBranches) {
		super(name,location,yearFounded,numberOfBranches);
	}

	// abstract methods
	@Override
	public void displayMenu() {
		System.out.println("Menu: Idli, Dosa, Vada, Uttapam, Pongal, Sambar, etc.");
	}

	@Override
	public void takeOnlineOrders() {
		System.out.println("You can place online orders through our website or mobile app.");
	}

	@Override
	public void offerHomeDelivery() {
		System.out.println("We offer home delivery services. Enjoy our food at your doorstep!");
	}
}
