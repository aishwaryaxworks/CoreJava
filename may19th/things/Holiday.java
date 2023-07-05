package com.xworks.may19th.things;

public class Holiday {
	
	public String reason;
	public int numOfDays;
	
	public Holiday() {
		System.out.println("This is holiday class - no argument constructor. ");
	}
	
	//non static method
	public boolean permission(boolean permission) {
		if (permission == true) {
			System.out.println("Permission granted !");
			return permission;
		}else {
			System.out.println("Permission not granted !");
			return permission;
		}
	}
	
	//Static method
	public static boolean getPermission(boolean permission) {
		if (permission == true) {
			System.out.println("Permission granted !");
			return permission;
		}else {
			System.out.println("Permission not granted !");
			return permission;
		}
	}
}
