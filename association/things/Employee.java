package com.xworkz.association.things;

import java.util.Date;

public class Employee {
	String name;
	Date date;
	public Lab lab1;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Lab lab1) {
		this.lab1=lab1;
		System.out.println("Employee class constructor!");
	}
}
