package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.OS;

public class OSRunner {

	public static void main(String[] args) {
       
        OS os1 = new OS();
        
        // Assign values using reference
        os1.name = "Windows";
        os1.version = "10";
        os1.releaseYear = 2015;
        os1.developer = "Microsoft";
        os1.is64Bit = true;
        os1.supportedLanguages = new String[]{"English", "Spanish", "French"};
        os1.installedUsers = 165465445;
        os1.isOpenSource = false;
        os1.marketShare = 77.31;
        os1.defaultBrowser = "Microsoft Edge";
        // Display the properties
        os1.displayProperties();
        System.out.println("------------------------------");

        // instance of all-argument constructor
        String[] supportedLanguages = {"English", "Hindi", "Spanish"};
        OS os2 = new OS("Linux", "Ubuntu", 2004, "Canonical Ltd.", true, supportedLanguages,
                45459875, true, 1.69, "Firefox");
        // Display the properties
        os2.displayProperties();
        System.out.println("------------------------------");
    }

}
