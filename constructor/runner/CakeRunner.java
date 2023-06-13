package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Cake;

public class CakeRunner {
	public static void main (String args[]) {
		Cake cake = new Cake();
		
		System.out.println("Printing Values before assigning values:");
		System.out.println("Flavor:"+cake.flavor);
		System.out.println("Price:"+cake.price+" & Weight:"+cake.weigth);
		System.out.println("Shape:"+cake.shape+" & Type:"+cake.types);
		
		cake.flavor = "Butter Scotch";
		cake.price = 450;
		cake.shape = "Square";
		cake.types = "Pastry";
		cake.weigth = 1.00f;
		
		System.out.println("------------------------------");
		System.out.println("Printing Values after assigning values:");
		System.out.println("Flavor:"+cake.flavor);
		System.out.println("Price:"+cake.price+" & Weight:"+cake.weigth);
		System.out.println("Shape:"+cake.shape+" & Type:"+cake.types);
	}

}
