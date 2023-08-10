package com.xworkz.association.things;

import java.util.Date;

public class Departments {
	String name;
	Date date;
	public Research res1;
	
	public Departments() {
		// TODO Auto-generated constructor stub
	}
	
	public Departments(Research res1) {
		this.res1=res1;
		System.out.println("Departments class constructor!");
	}
}
