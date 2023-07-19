package com.xworks.may19th.things;

import java.util.Date;

public class Rain {
	final int range=20;
	public static String day;
	static final String location = "BTM Layout";
	
	private static final String duration="1 hour";
	protected static final Date date = new Date();
	
	public Rain() {
		// TODO Auto-generated constructor stub
	}
	
	//instance method
	void flood() {
		System.out.println("Flood - Rain");
	}
	
	//final instance method
	final void display1() {
		System.out.println("Display1 - Rain");
	}
	
	final void display2(String duration) {
		System.out.println("Display2 - Rain - Duration");
	}
	
	//static method
	static void wet() {
		System.out.println("Wet - Rain");
	}
	
	//final static method
	final static void force() {
		System.out.println("Force - Rain");
	}
	
}
