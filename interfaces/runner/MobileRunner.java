package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.things.Charger;
import com.xworkz.interfaces.things.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		//1st type of object creating
		Charger charger = new Charger("Vivo");
		Mobile mobile1 = new Mobile(charger);
		
		//2nd type of object creation
		Mobile mobile2 = new Mobile(new Charger("Xaoi-MI"));
		
		
	}
}
