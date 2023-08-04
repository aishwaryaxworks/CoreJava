package com.xworkz.assignment2.things;

public class Alphabets {
	public int asciiNumber;

	public void caseAlphabet(int asciiNumber) {
		char character = (char) asciiNumber;
		if (asciiNumber >= 97 && asciiNumber <= 122) {
			System.out.println("The ASCII number belongs to a Lowercase alphabet.");
			System.out.println("Corresponding character: " + character);
			System.out.println("------------------------------------");
		}else if (asciiNumber >= 65 && asciiNumber <= 90) {
			System.out.println("The ASCII number belongs to an Uppercase alphabet.");
			System.out.println("Corresponding character: " + character);
			System.out.println("------------------------------------");
		}else {
			System.out.println("The ASCII number does not belong to any alphabet.");
		}
	}

	public static void main(String[] args) {
		Alphabets alpha1 = new Alphabets();
		alpha1.caseAlphabet(98);
		
		Alphabets alpha2 = new Alphabets();
		alpha2.caseAlphabet(70);
		
		Alphabets alpha3 = new Alphabets();
		alpha3.caseAlphabet(130);
	}
}
