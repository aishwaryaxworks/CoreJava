package com.xworkz.association.things;

import java.util.Date;

public class Investor {
	String name;
	Date date;
	public Machines machine1;
	
	public Investor() {
		// TODO Auto-generated constructor stub
	}
	public Investor(Machines machine1) {
		this.machine1=machine1;
		System.out.println("Investor class constructor!");
	}
}
