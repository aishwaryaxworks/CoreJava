package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.RapidoLocation;
import com.xworkz.inheritance.things.Rapido;

public class RapidoRunner extends RapidoLocation {

	public static void main(String[] args) {
		// Location loc = new Location();
		// Rapido rapido = new Rapido();
		RapidoRunner loc1 = new RapidoRunner();
		loc1.customerName = "Hari";
		System.out.println(loc1.customerName);
		loc1.displayLocation();

//		Rapido rapido = new Rapido();
//		rapido.display();
		Rapido rl = new RapidoLocation();
		rl.display();

	}

}
