package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Hirect;

public class HirectRunner {

	public static void main(String[] args) {
        // no-argument constructor
        Hirect hirect1 = new Hirect();
        
        // Assign values using the setter methods
        hirect1.companyName = "ABC Corp";
        hirect1.industry = "Technology";
        hirect1.employeesCount = 1000;
        hirect1.headquartersLocation = "New York";
        hirect1.isPublicCompany = true;
        // Display the properties
        hirect1.displayProperties();

        System.out.println("-----------------------------"); 
        
        // all-argument constructor
        Hirect hirect2 = new Hirect("XYZ Corp", "Finance", 500, "London", false);
        // Display the properties
        hirect2.displayProperties();
        System.out.println("-----------------------------");
    }

}
