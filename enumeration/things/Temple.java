package com.xworkz.enumeration.things;

public class Temple {
	String name="Thirupathi";
    String location;
    TempleDeity deity;
    TempleVisitors visitorCapacity;
    
    public Temple() {
		System.out.println("No argument constructor-Temple");
	}

	public Temple(String name, String location, TempleDeity deity, TempleVisitors visitorCapacity) {
		this.name = name;
		this.location = location;
		this.deity = deity;
		this.visitorCapacity = visitorCapacity;
	}
	
	public Temple(String location) {
		this.location = location;
	}

	public void setDeity(TempleDeity deity) {
		this.deity=deity;
	}
    
	public void displayTemple() {
		System.out.println("Temple: "+this.name+", "+this.location+", "+this.deity+", "+this.visitorCapacity);
	}
    
}
