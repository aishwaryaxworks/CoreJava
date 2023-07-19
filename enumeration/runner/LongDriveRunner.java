package com.xworkz.enumeration.runner;

import com.xworkz.enumeration.things.DriveDest;
import com.xworkz.enumeration.things.LongDrive;

public class LongDriveRunner {

	public static void main(String[] args) {
		LongDrive ld1 = new LongDrive();
		ld1.displayDrive();
		
		LongDrive ld2 = new LongDrive();
		ld2.setDuration(8.5);
		
		LongDrive ld3 = new LongDrive(DriveDest.NANDI_HILLS,54.8,5.6,4200);
		ld3.displayDrive();
		
		LongDrive ld4 = new LongDrive();
		ld4.setDuration(7.9);
		ld4.displayDrive();
		
		System.out.println(ld4.getClass());
		
	}

}
