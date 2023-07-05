package com.xworks.may19th.things;

public class Travelling {
	private String place;
	private int distance;
	private int cost;
	
	private void onStart() {
		System.out.println("Trip Started...!");
	}
	
	private static void modeOfTravel(String vehicle) {
		System.out.println("Mode of Transport:"+vehicle);
	}
	
}
