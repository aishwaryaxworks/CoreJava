package com.xworks.may19th.runner;

import com.xworks.may19th.things.Flag;

public class FlagRunner {

	public static void main(String[] args) {
		Flag flag = new Flag();
		flag.setPrice(100);
		System.out.println("Price:"+flag.getPrice());
		
		int value = flag.getPrice()+50;
		System.out.println("Value:"+value);
		System.out.println("Price:" + flag.getPrice());
		
		Flag flag1 = flag;
		flag1.setPrice(150);
		System.out.println("Second object price:"+flag1.getPrice());
		System.out.println("First object price:"+flag.getPrice());
	}
}
