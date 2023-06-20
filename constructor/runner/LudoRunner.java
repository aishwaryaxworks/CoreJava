package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Ludo;

public class LudoRunner {

	public static void main(String[] args) {
		Ludo ludo = new Ludo();
		
		//calling non static methods using object
		ludo.diceRoll();
		ludo.move();
		
		//static methods are called using class name
		Ludo.playing();

	}
}
