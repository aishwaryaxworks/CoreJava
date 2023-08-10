package com.xworkz.association.runner;

import com.xworkz.association.things.Departments;
import com.xworkz.association.things.Employee;
import com.xworkz.association.things.Investor;
import com.xworkz.association.things.Isro;
import com.xworkz.association.things.Lab;
import com.xworkz.association.things.Machines;
import com.xworkz.association.things.Research;

public class IsroRunner {

	public static void main(String[] args) {
		Isro isro1 = new Isro(new Departments(new Research(new Employee(new Lab(new Investor(new Machines()))))));
		System.out.println("-------------------------------------------------------");
		Isro isro2 = new Isro(new Departments(new Research(new Employee(new Lab(new Investor())))));
		System.out.println("-------------------------------------------------------");
		Isro isro3 = new Isro(new Departments(new Research(new Employee(new Lab()))));
		System.out.println("-------------------------------------------------------");
		Isro isro4 = new Isro(new Departments(new Research(new Employee())));
		System.out.println("-------------------------------------------------------");
		Isro isro5 = new Isro(new Departments(new Research()));
		System.out.println("-------------------------------------------------------");
		Isro isro6 = new Isro(new Departments());
		System.out.println("-------------------------------------------------------");
		Isro isro7 = new Isro();
	}

}
