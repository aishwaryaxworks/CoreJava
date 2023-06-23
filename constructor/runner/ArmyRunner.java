package com.xworkz.constructor.runner;

import java.util.Date;

import com.xworkz.constructor.things.Army;

public class ArmyRunner {

	public static void main(String[] args) {
		Army army1 =new Army();
		
		army1.armyDetails();
		army1.armyDetails("Airforce");
		army1.armyDetails("Airforce", "Bhuj");
		army1.armyDetails("Airforce", "Bhuj", "Delta");
		army1.armyDetails("Airforce", "Bhuj", "Delta", 20);
		army1.armyDetails("Airforce", "Bhuj", "Delta", 20, 5);
		army1.armyDetails(new Date());
		army1.armyDetails("Bangalore", new Date());

	}
}
