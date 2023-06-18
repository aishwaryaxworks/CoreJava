package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop("Apple","MacBook Pro",14,96,"Linux");
		laptop1.displayLaptop();
		laptop2.displayLaptop();
	}
}
