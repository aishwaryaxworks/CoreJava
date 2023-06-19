package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Flights;

public class FlightsRunner {
	
	public static void main(String[] args) {
		Flights flight1 = new Flights();
		Flights flight2 = new Flights("FR25509","Ryanair","Rome(Ciampino)","London(Stansted)",12.30);
		flight1.displayFlight();
		flight2.displayFlight();
	}

}
