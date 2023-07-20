package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Iron;

public class IronRunner {

	public static void main(String[] args) {
		Iron iron1 = new Iron();
		String val1 = iron1.toString();
		System.out.println(val1);	
		
		Iron iron2 = new Iron("Rowenta", "DW5080", 1000, true, 2.5, 200);
		String val2 = iron2.toString();
		System.out.println(val2);
		
		boolean eq1 = iron1.equals(iron2);
		System.out.println("Are the values equal?:"+eq1);
		
		Iron iron3 = new Iron("Black & Decker","FV4495", 2000, false, 3.6, 100);
		String val3 = iron3.toString();
		System.out.println(val3);
		boolean eq2 = iron2.equals(iron3);
		System.out.println("Are the values equal?:"+eq2);
		
		Iron iron4 = new Iron("Black & Decker","FV4495", 2000, false, 3.6, 100);
		String val4 = iron4.toString();
		System.out.println(val4);
		boolean eq3 = iron3.equals(iron4);
		System.out.println("Are the values equal?:"+eq3);
	
	}

}
