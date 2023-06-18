package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Apartment;

public class ApartmentRunner {

	public static void main(String[] args) {
		Apartment apart1 = new Apartment();
		Apartment apart2 = new Apartment("Prestige Falcon",4,4,"Konankunte",25000);
		apart1.displayApartment();
		apart2.displayApartment();
	}

}
