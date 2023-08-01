package com.xworkz.assignment2.runner;

import com.xworkz.assignment2.things.PaakashaalaSubclass;

public class PaakashaalaRunner {

	public static void main(String[] args) {
		PaakashaalaSubclass restaurant = new PaakashaalaSubclass("Paakashaala", "South India", 2000, 10);

		//Invoking the methods
		restaurant.greetCustomers();
		System.out.println("------------------------------");
		
		restaurant.displayInfo();
		System.out.println("------------------------------");
		
		restaurant.displayMenu();
		System.out.println("------------------------------");
		
		restaurant.takeOnlineOrders();
		System.out.println("------------------------------");
		
		restaurant.offerHomeDelivery();
		System.out.println("------------------------------");
		
		restaurant.serveFood();
		System.out.println("------------------------------");
		
		restaurant.collectFeedback();
	}
}
