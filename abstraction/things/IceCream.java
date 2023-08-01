package com.xworkz.abstraction.things;

public abstract class IceCream {
	public String brand1;
	public transient String brand2;
	public volatile String flavor;
	
	public IceCream() {
		this("chikoo");
		System.out.println("no argument constructor of IceCream");
	}
	
	public IceCream(String brand1) {
		this.brand1 = brand1;
		System.out.println("argument constructor of IceCream");
	}

	public abstract void coconutBrand();
	
	
}
