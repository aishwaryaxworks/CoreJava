package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Shift;

public class ShiftRunner {

	public static void main(String[] args) {
		Shift packers_movers = new Shift();
		Shift conveyances = new Shift("11.30am","Morning",5,2,true,"Rajajinagar");
		if(conveyances != null) {
			System.out.println("conveyances object is not null.");
		conveyances.displayStaff();
		}
//		else {
//			System.out.println("conveyances object is null.");
//		}
	}

}
