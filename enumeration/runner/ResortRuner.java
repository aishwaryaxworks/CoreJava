package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.things.Resort;
import com.xworkz.enumeration.things.ResortAmenities;
import com.xworkz.enumeration.things.ResortRating;

public class ResortRuner {
	public static void main(String[] args) {
		Resort resort1 = new Resort();
		resort1.displayResort();
		
		Resort resort2 = new Resort("The Taj Lake Palace");
		resort2.displayResort();
		
		Resort resort3 = new Resort("Wild Flower","Shimla",ResortRating.THREE,ResortAmenities.JACCUZZI);
		resort3.displayResort();
		
		Resort resort4 = new Resort();
		resort4.setLocation("Jaipur");
		resort4.displayResort();
	}

}
