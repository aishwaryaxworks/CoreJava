package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Ott;

public class OttRunner {
	public static void main(String[] args) {
		Ott ott1 = new Ott();
		String val1 = ott1.toString();
		System.out.println(val1);	
		
		Ott ott2 = new Ott("King-The Land",02);
		String val2 = ott2.toString();
		System.out.println(val2);
		
		boolean eq1 = ott1.equals(ott2);
		System.out.println("Is the values equal?:"+eq1);
		
		Ott ott3 = new Ott("Cheer Up", 05);
		String val3 = ott3.toString();
		System.out.println(val3);
		boolean eq2 = ott2.equals(ott3);
		System.out.println("Are the values equal?:"+eq2);
		
		Ott ott4 = new Ott("Cheer Up", 05);
		String val4 = ott4.toString();
		System.out.println(val4);
		boolean eq3 = ott3.equals(ott4);
		System.out.println("Are the values equal?:"+eq3);
	}
}
