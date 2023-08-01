package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.things.Coconut;
import com.xworkz.abstraction.things.IceCream;

public class IceCreamRunner {
	public static void main(String[] args) {
		IceCream ic = new Coconut();
		ic.brand2="Kwalitywalls";
		System.out.println(ic.brand2);
		ic.flavor="Butterscotch";
		System.out.println(ic.flavor);
	}

}
