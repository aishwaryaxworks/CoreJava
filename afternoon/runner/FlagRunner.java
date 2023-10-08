package com.xworkz.afternoon.runner;

import com.xworkz.afternoon.things.Flag;

public class FlagRunner {

	public static void main(String[] args) throws CloneNotSupportedException {
		Flag flag = new Flag();
		flag.setColor("White");
		System.out.println(flag.getColor());
		System.out.println("Values of flag:"+flag);
		
		Flag flag1 = (Flag)flag.clone();
		flag1.setColor("Green");
		flag1.setPrice(50);
		System.out.println("Values of flag1:"+flag1);
		
	}
}
