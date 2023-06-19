package com.xworkz.assignments.things;

public class RedBus {
	
	// Assign values using literal way
	public String company="ABC Travels";
	public String origin="New York";
	public String destination="Boston";
	public String departureTime="9:00 AM";
	public String arrivalTime="11:30 AM";
	public int duration=150;
	public int seatsAvailable=30;
	public double fare=25.99;
	public String busType="Sleeper";
	public boolean isAC=true;

    // No-argument constructor
    public RedBus() {
    	System.out.println("No argument constructor.");
    }

    // All-argument constructor
    public RedBus(String company, String origin, String destination, String departureTime, String arrivalTime,
                  int duration, int seatsAvailable, double fare, String busType, boolean isAC) {
        this.company = company;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.seatsAvailable = seatsAvailable;
        this.fare = fare;
        this.busType = busType;
        this.isAC = isAC;
        System.out.println("All argument constructor.");
    }

    // Display method
    public void displayProperties() {
        System.out.println("Company: " + company);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Seats Available: " + seatsAvailable);
        System.out.println("Fare: $" + fare);
        System.out.println("Bus Type: " + busType);
        System.out.println("AC: " + isAC);
    }

    
}
