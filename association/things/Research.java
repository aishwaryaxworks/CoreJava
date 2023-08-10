package com.xworkz.association.things;

import java.util.Date;

public class Research {
	String name;
	Date date;
	public Employee emp1;
	
	public Research() {
		// TODO Auto-generated constructor stub
	}
	
	public Research(Employee emp1) {
		this.emp1=emp1;
		System.out.println("Research class constructor!");
	}

}
