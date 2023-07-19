package com.xworkz.enumeration.things;

public class LongDrive {
	DriveDest destination;
    double distance;
    double duration;
    double fuelConsumption=5500;
    
    public LongDrive() {
		System.out.println("No argument constructor-Long Drive");
	}
    
    public LongDrive(DriveDest destination, double distance, double duration, double fuelConsumption) {
        this.destination = destination;
        this.distance = distance;
        this.duration = duration;
        this.fuelConsumption = fuelConsumption;
    }
    
    public void setDuration(double duration) {
    	this.duration=duration;
    }
    
    public void displayDrive() {
		System.out.println("Drive details: "+this.destination+", "+this.distance+", "+this.duration+", "+this.fuelConsumption);
	}

}
