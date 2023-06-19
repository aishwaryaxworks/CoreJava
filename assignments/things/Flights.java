package com.xworkz.assignments.things;

public class Flights {
	public String flightNumber;
	public String airline;
	public String origin;
	public String destination;
	public double duration;
	
	//default constructor
	public Flights() {
		System.out.println("------Default Constructor.-----");
	}
			
	//parameterized constructor
	public Flights(String flightNumber, String airline, String origin, String destination, double duration) {
		System.out.println("-----Parameterized Constructor.-----");
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;		
	}
			
	public void displayFlight() {
		System.out.println("Flight number:"+this.flightNumber+", Airline:"+this.airline+", Origin:"+this.origin+
				", Destination:"+this.destination+", Duration:"+this.duration);
	}

}
