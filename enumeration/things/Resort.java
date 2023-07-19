package com.xworkz.enumeration.things;

public class Resort {
	String name="The Oberoi Udaivilas";
    String location;
    ResortRating rating;
    ResortAmenities amenities;
    
    public Resort() {
		System.out.println("No argument constructor-Resort");
	}
    
    public Resort(String name) {
		this.name=name;
	}

	public Resort(String name, String location, ResortRating rating, ResortAmenities amenities) {
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.amenities = amenities;
	}
	
	public void displayResort() {
		System.out.println("Resort Details:"+this.name+", "+this.location+", "+this.rating+", "+this.amenities);
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
}
