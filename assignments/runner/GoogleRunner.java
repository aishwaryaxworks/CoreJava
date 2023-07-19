package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.CityMapper;
import com.xworkz.assignments.things.Google;
import com.xworkz.assignments.things.GoogleMaps;

public class GoogleRunner extends CityMapper{
	public static void main(String[] args) {
		Google g1 = new Google();
		System.out.println("Ceo:"+g1.ceo);
		
		GoogleMaps g2 = new GoogleMaps();
		g2.searchLocation="Seoul";
		System.out.println("Location:"+g2.searchLocation);
				
		CityMapper g3 = new CityMapper();
		g3.userName="Aishwarya";
		g3.displayUserName();
		
		Google g4 = new CityMapper();
		g4.userName="abdce";
		g4.displayUserName();
		
		//Hybrid inheritance is not possible as there cannot be more than one parent for every child class
		//Hierarchical inheritance is many sub-classes having same parent class 
	}
}
