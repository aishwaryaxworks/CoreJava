package com.xworkz.association.things;

import java.util.Date;

public class Lab {
	String name;
	Date date;
	public Investor investor1;
	
	public Lab() {
		// TODO Auto-generated constructor stub
	}
	public Lab(Investor investor1) {
		this.investor1=investor1;
		System.out.println("Lab class constructor!");
	}
}
