package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Joker;

public class JokerRunner {

	public static void main(String[] args) {
		Joker joker1 = new Joker();
		String val1 = joker1.toString();
		System.out.println(val1);	
		
		Joker joker2 = new Joker("The Joker", 40, "Why so serious?", "Ha Ha Ha!", "Purple", true, 1000, true);
		String val2 = joker2.toString();
		System.out.println(val2);
		
		boolean eq1 = joker1.equals(joker2);
		System.out.println("Are the values equal?:"+eq1);
		
		Joker joker3 = new Joker("Crazy Clown", 35, "Nobody panics when things go according to plan.", "Why don't we cut you up "
				+ "into little pieces and feed you to your pooches?", "Green", false, 500, false);
		String val3 = joker3.toString();
		System.out.println(val3);
		boolean eq2 = joker2.equals(joker3);
		System.out.println("Are the values equal?:"+eq2);
		
		Joker joker4 = new Joker("Crazy Clown", 35, "Nobody panics when things go according to plan.", "Why don't we cut you up "
				+ "into little pieces and feed you to your pooches?", "Green", false, 500, false);
		String val4 = joker4.toString();
		System.out.println(val4);
		boolean eq3 = joker3.equals(joker4);
		System.out.println("Are the values equal?:"+eq3);
	}

}
