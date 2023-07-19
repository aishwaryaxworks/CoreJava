package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.things.Temple;
import com.xworkz.enumeration.things.TempleDeity;
import com.xworkz.enumeration.things.TempleVisitors;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple1 = new Temple();
		temple1.displayTemple();
		
		Temple temple2 = new Temple("Dharmasthala","North Karnataka",TempleDeity.SHIVA,TempleVisitors.ONE_THOUSAND);
		temple2.displayTemple();
		
		Temple temple3 = new Temple("Kashi");
		temple3.displayTemple();
		
		Temple temple4 = new Temple();
		temple4.setDeity(TempleDeity.MURUGAN);
		temple4.displayTemple();
	}

}
