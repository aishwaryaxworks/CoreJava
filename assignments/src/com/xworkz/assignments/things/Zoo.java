package com.xworkz.assignments.things;

public class Zoo {
	public String[] name;
	public String[] animalTypes;
	public int[] numberOfAnimals;
	public boolean hasAquarium;
	public String location;
	public int visitorCapacity;
	
	public void displayAnimal1(String[] name) {
		this.name = name;
		for (int i=0; i<=name.length-1; i++) {
			System.out.println("Name:"+this.name[i]);
		} 
	}

	public void displayAnimal2(String[] name, String[] animalTypes) {
		this.name = name;
		this.animalTypes = animalTypes;
		for (int i=0; i<=name.length-1; i++) {
			System.out.println("Name:"+this.name[i]);
			System.out.println("Animal Type:"+this.animalTypes[i]);
		} 
	}

	public void displayAnimal3(String[] name, String[] animalTypes, int[] numberOfAnimals) {
		this.name = name;
		this.animalTypes = animalTypes;
		this.numberOfAnimals = numberOfAnimals;
		for (int i=0; i<=name.length-1; i++) {
			System.out.println("Name:"+this.name[i]);
			System.out.println("Animal Type:"+this.animalTypes[i]);
			System.out.println("Number of Animals:"+this.numberOfAnimals[i]);
		} 
	}

	public void displayAnimal4(boolean hasAquarium, String name[]) {
		this.hasAquarium = hasAquarium;
		this.name = name;
		for (int i=0; i<=name.length-1; i++) {
			System.out.println("Has Aquarium?:"+this.hasAquarium+", Name:"+this.name[i]);
		} 
	}

	public void displayAnimal5(boolean hasAquarium, String location, int visitorCapacity, String name[]) {
		this.hasAquarium = hasAquarium;
		this.location = location;
		this.visitorCapacity = visitorCapacity;
		this.name = name;
		for (int i=0; i<=name.length-1; i++) {
			System.out.println("Has Aquarium?:"+this.hasAquarium+", Location:"+this.location+", "
					+ "Visitor Capacity:"+this.visitorCapacity+", Name:"+this.name[i]);
		} 
	}

	//No argument constructor
	public Zoo() {
		System.out.println("This no argument constructor.");
		System.out.println("---------------------");
	}

	//all argument constructor
	public Zoo(boolean hasAquarium, String location, int visitorCapacity, String[] name, 
			String[] animalTypes, int[] numberOfAnimals) {
		System.out.println("This is all argument constructor.");
		System.out.println("---------------------");
	}

	//one argument constructor
	public Zoo(String location) {
		this.location = location;
		System.out.println("This constructor accepts one argument.");
		System.out.println("Location:"+this.location);
		System.out.println("---------------------");
	}

	//two argument constructor 
	public Zoo(boolean hasAquarium, String location) {
		this.hasAquarium = hasAquarium;
		this.location = location;
		System.out.println("This constructor accepts two arguments.");
		System.out.println("Has Aquarium?:"+this.hasAquarium+", Location:"+this.location);
		System.out.println("---------------------");
	}

	//three argument constructor 
	public Zoo(boolean hasAquarium, String location, int visitorCapacity) {
		this.hasAquarium = hasAquarium;
		this.location = location;
		this.visitorCapacity = visitorCapacity;
		System.out.println("This constructor accepts three arguments.");
		System.out.println("Has Aquarium?:"+this.hasAquarium+", Location:"+this.location+", "
				+ "Visitor Capacity:"+this.visitorCapacity);
		System.out.println("---------------------");
	}

	//one argument constructor - array
	public Zoo(String[] name) {
		this.name = name;
		System.out.println("This constructor accepts one array.");
		displayAnimal1(name);
		System.out.println("---------------------");
	}

	//two argument constructor - array
	public Zoo(String[] name, String[] animalTypes) {
		this.name = name;
		this.animalTypes = animalTypes;
		System.out.println("This constructor accepts two arrays.");
		displayAnimal2(name, animalTypes);
		System.out.println("---------------------");
	}

	//three argument constructor - array
	public Zoo(String[] name, String[] animalTypes, int[] numberOfAnimals) {
		this.name = name;
		this.animalTypes = animalTypes;
		this.numberOfAnimals = numberOfAnimals;
		System.out.println("This constructor accepts three arrays.");
		displayAnimal3(name, animalTypes, numberOfAnimals);
		System.out.println("---------------------");
	}

	//one argument - one array
	public Zoo(boolean hasAquarium, String name[]) {
		this.hasAquarium = hasAquarium;
		this.name = name;

		System.out.println("This constructor accepts one arguement and one array.");
		displayAnimal4(hasAquarium, name);		
		System.out.println("---------------------");
	}

	//three argument - one array
	public Zoo(boolean hasAquarium, String location, int visitorCapacity, String name[]) {
		this.hasAquarium = hasAquarium;
		this.location = location;
		this.visitorCapacity = visitorCapacity;
		this.name = name;

		System.out.println("This constructor accepts three arguement and one array.");
		displayAnimal5(hasAquarium, location, visitorCapacity, name);		
		System.out.println("---------------------");
	}
}
