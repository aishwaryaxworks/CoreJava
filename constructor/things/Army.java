package com.xworkz.constructor.things;

import java.util.Date;

public class Army {
	public String type;
	public String location;
	public String campName;
	public Date joiningDate;
	public int numOfSoilders;
	public int numOfMissions;
	
	public Army() {
		System.out.println("No argument constructor.");
	}
	
	public Army(String type,String location,String campName,Date joiningDate,
			int numOfSoilders,int numOfMissions) {
		this.campName = campName;
		this.type = type;
		this.location = location;
		this.joiningDate = joiningDate;
		this.numOfSoilders = numOfSoilders;
		this.numOfMissions = numOfMissions;
		System.out.println("All argument constructor.");
	}
	
	public void armyDetails() {
		System.out.println("No arguments.");
	}
	
	public void armyDetails(String type) {
		this.type=type;
		System.out.println("1 argument.");
		System.out.println("Type:"+this.type);
	}
	
	public void armyDetails(String type,String location) {
		this.type=type;
		this.location=location;
		System.out.println("2 argument.");
		System.out.println("Type:"+this.type+", Location:"+this.location);
	}
	
	public void armyDetails(String type,String location,String campName) {
		this.type=type;
		this.location=location;
		this.campName=campName;
		System.out.println("3 argument.");
		System.out.println("Type:"+this.type+", Location:"+this.location+", Camp Name:"+this.campName);
	}
	
	public void armyDetails(String type,String location,String campName, int numOfSoilders) {
		this.type=type;
		this.location=location;
		this.campName=campName;
		this.numOfSoilders=numOfSoilders;
		System.out.println("4 argument.");
		System.out.println("Type:"+this.type+", Location:"+this.location+", Camp Name:"+this.campName+","
				+ " Number of Soilders:"+this.numOfSoilders);
	}
	
	public void armyDetails(String type,String location,String campName, int numOfSoilders,int numOfmissions) {
		this.type=type;
		this.location=location;
		this.campName=campName;
		this.numOfSoilders=numOfSoilders;
		this.numOfMissions=numOfmissions;
		System.out.println("5 argument.");
		System.out.println("Type:"+this.type+", Location:"+this.location+", Camp Name:"+this.campName+","
				+ " Number of Soilders:"+this.numOfSoilders+", Number of Missions:"+this.numOfMissions);
	}
	
	public void armyDetails(Date joiningDate) {
		this.joiningDate=joiningDate;
		System.out.println("Joining Date is:"+this.joiningDate);
	}
	
	public void armyDetails(String location, Date joiningDate) {
		this.location=location;
		this.joiningDate=joiningDate;
		System.out.println("Location:"+this.location+", Joining Date is:"+this.joiningDate);
	}
	
}
