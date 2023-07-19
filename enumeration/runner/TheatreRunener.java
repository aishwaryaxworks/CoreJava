package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.things.Theatre;
import com.xworkz.enumeration.things.TheatreName;

public class TheatreRunener {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre();
		theatre1.displayTheatre();
		
		Theatre theatre2 = new Theatre("Bangalore south");
		theatre1.displayTheatre();
		
		Theatre theatre3 = new Theatre(TheatreName.PVR,"Bannerghatta main road",1500,450);
		theatre2.displayTheatre();
		
		Theatre theatre4 = new Theatre();
		theatre4.setCapacity(1000);
		theatre4.displayTheatre();
	}

}
