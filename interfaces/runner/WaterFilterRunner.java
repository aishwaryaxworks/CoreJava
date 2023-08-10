package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.interfaces.WaterFilter;
import com.xworkz.interfaces.things.Jug;

public class WaterFilterRunner {

	public static void main(String[] args) {
		WaterFilter wf = new Jug ();
		String val = wf.filter();
		System.out.println(val);
		
		Jug j = new Jug();
		WaterFilterRunner wr = new WaterFilterRunner();
		
		System.out.println("Is variable wf instance of WaterFilter class?:" + (wf instanceof WaterFilter));
		System.out.println("Is variable j instance of Jug class?:" + (j instanceof Jug));
		
		System.out.println("Is variable j instance of WaterFilter class?:" + (j instanceof WaterFilter));
		System.out.println("Is variable wf instance of Jug class?:" + (wf instanceof Jug));
		
		System.out.println("Is variable wr instance of WaterFilter class?:" + (wr instanceof WaterFilter));
		
	}

}
