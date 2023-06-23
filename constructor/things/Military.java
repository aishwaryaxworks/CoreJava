package com.xworkz.constructor.things;

import java.util.Date;

public class Military {
	public String type;
	public String location;
	public String campName;
	public Date joiningDate;
	public int numOfSoilders;
	public int numOfMissions;
	
	public Military() {
		System.out.println("No argument constructor.");
	}
	
	public Military(String type,String location,String campName,Date joiningDate,
			int numOfSoilders,int numOfMissions) {
		this.campName = campName;
		this.type = type;
		this.location = location;
		this.joiningDate = joiningDate;
		this.numOfSoilders = numOfSoilders;
		this.numOfMissions = numOfMissions;
		System.out.println("All argument constructor.");
	}
	
	public void defencing() {
		System.out.println("Defencing method.");
		protecting();
	}
	
	public void protecting() {
		System.out.println("Protecting method.");
		celebrating();
	}
	
	public void celebrating() {
		System.out.println("Celebrating method.");
		investigating();
	}
	
	public void investigating() {
		System.out.println("Investing method.");
		selectionProcess();
	}
	
	public void selectionProcess() {
		System.out.println("Selection process method.");
		training();
	}
	
	public void training() {
		System.out.println("Training method.");
	}
}
