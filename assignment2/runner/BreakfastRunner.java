package com.xworkz.assignment2.runner;

import com.xworkz.assignment2.things.Breakfast;

public class BreakfastRunner {

	public static void main(String[] args) {
		Breakfast bf = new Breakfast(1,20.50,false,'N',"Shawarma",6,5.0,"Kebab Magic",'N');
		bf.setCategory('V');
		bf.setChef("KFC");
		bf.setId(2);
		bf.setIngredients(20);
		bf.setMenu('V');
		bf.setName("Zinger");
		bf.setNutritionInfo(6.8);
		bf.setPrice(259.9);
		bf.setVegetarian(true);

		// Printing the Training object as a String
		System.out.println(bf.toString());

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
