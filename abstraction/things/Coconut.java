package com.xworkz.abstraction.things;

public class Coconut extends IceCream{
	
	public Coconut() {
		super();
		System.out.println("no argument constructor of coconut.");
	}
	
	@Override
	public void coconutBrand() {
		System.out.println("Overridden coconut brand method.");
	}
}
