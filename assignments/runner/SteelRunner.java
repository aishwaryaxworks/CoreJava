package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Steel;

public class SteelRunner {
	public static void main(String[] args) {
		Steel steel1 = new Steel();
		String val1 = steel1.toString();
		System.out.println(val1);	
		
		Steel steel2 = new Steel("Iron ore",500);
		String val2 = steel2.toString();
		System.out.println(val2);
		
		boolean eq1 = steel1.equals(steel2);
		System.out.println("Are the values equal?:"+eq1);
		
		Steel steel3 = new Steel("Pig Iron", 250);
		String val3 = steel3.toString();
		System.out.println(val3);
		boolean eq2 = steel2.equals(steel3);
		System.out.println("Are the values equal?:"+eq2);
		
		Steel steel4 = new Steel("Pig Iron", 250);
		String val4 = steel4.toString();
		System.out.println(val4);
		boolean eq3 = steel3.equals(steel4);
		System.out.println("Are the values equal?:"+eq3);
	}

}
