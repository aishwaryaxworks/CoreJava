package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Zoo;

public class ZooRunner {

		public static void main(String[] args) {
			Zoo animal0 = new Zoo();
			Zoo animal1 = new Zoo("Africa");
			Zoo animal2 = new Zoo(true, "Africa");
			Zoo animal3 = new Zoo(true, "Africa", 500);
			
			String[] name = {"Madagaskar","Mysore","Bannerghatta"};
			String[] animalTypes = {"Penguin", "Zebra", "Lion"};
			int[] numberOfAnimals = {4,20,2};
			
			Zoo animal4 = new Zoo(name);
			Zoo animal5 = new Zoo(name, animalTypes);
			Zoo animal6 = new Zoo(name, animalTypes, numberOfAnimals);
			
			Zoo animal7 = new Zoo(true, name);
			Zoo animal8 = new Zoo(true, "Africa", 500, name);
			Zoo animal9 = new Zoo(true, "Africa", 500, name,animalTypes,numberOfAnimals);
	}
}
