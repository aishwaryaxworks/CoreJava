package com.xworkz.association.things;

import java.util.Date;

public class Isro {
	String name;
	Date date;
	public Departments dept1;
	
	public Isro() {
		// TODO Auto-generated constructor stub
	}
	
	public Isro(Departments dept1) {
		this.dept1=dept1;
		System.out.println("Isro class constructor!");
	}

}
