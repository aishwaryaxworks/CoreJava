package com.xworkz.assignment2.runner;

import com.xworkz.assignment2.things.Project;

public class ProjectRunner {

	public static void main(String[] args) {
		Project proj = new Project();
		proj.setActive(true);
		proj.setBudget(25012.54);
		proj.setProjectDetails("Java project");
		proj.setProjectId(12);
		proj.setProjectManager("Vinoda");
		proj.setProjectName("Test project");
		proj.setProjectType('B');
		proj.setTeamMembers(8);

		// Printing the Training object as a String
		System.out.println(proj.toString());

		// Converting primitive datatypes to String
		int intValue = 100;
		String stringValue = String.valueOf(intValue);
		System.out.println("int to String: " + stringValue);

		double doubleValue = 3.14;
		stringValue = String.valueOf(doubleValue);
		System.out.println("double to String: " + stringValue);

		boolean booleanValue = true;
		stringValue = String.valueOf(booleanValue);
		System.out.println("boolean to String: " + stringValue);

		char charValue = 'A';
		stringValue = String.valueOf(charValue);
		System.out.println("char to String: " + stringValue);

		// Converting String to primitive datatypes
		String intString = "200";
		int parsedInt = Integer.parseInt(intString);
		System.out.println("String to int: " + parsedInt);

		String doubleString = "3.14159";
		double parsedDouble = Double.parseDouble(doubleString);
		System.out.println("String to double: " + parsedDouble);

		String booleanString = "false";
		boolean parsedBoolean = Boolean.parseBoolean(booleanString);
		System.out.println("String to boolean: " + parsedBoolean);

		String charString = "X";
		char parsedChar = charString.charAt(0);
		System.out.println("String to char: " + parsedChar);

	}

}
