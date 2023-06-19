package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.RedBus;

public class RedBusRunner {

	public static void main(String[] args) {

		RedBus bus1 = new RedBus();
        bus1.displayProperties();

        System.out.println("---------------------------"); 

        //all-argument constructor
        RedBus bus2 = new RedBus("XYZ Travels", "Chicago", "Los Angeles", "6:00 PM", "8:30 AM", 780, 50, 89.99,
                "Semi-Sleeper", false);
        // Display the properties
        bus2.displayProperties();
        System.out.println("---------------------------"); 
    }

}
