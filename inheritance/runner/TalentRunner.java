package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Talent;

public class TalentRunner {
		
	public static void main(String[] args) {
		Talent talent1 = new Talent();
		String val = talent1.toString();
		System.out.println("This is toString retruned result:"+val);
		
		Talent talent2 = new Talent("Cooking",7);
		String objval = talent2.toString();
		System.out.println(objval);
		
		boolean result1 = talent1.equals(talent2);
		System.out.println(result1);
		
		Talent talent3 = new Talent("Cooking",7);
		boolean result2 = talent2.equals(talent3);
		System.out.println(result2);
	}
}
