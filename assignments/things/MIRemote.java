package com.xworkz.assignments.things;

public class MIRemote extends ArtificialIntelligence {
	protected String model;
    protected boolean isConnected;
    protected int batteryLevel;
    protected String[] supportedCommands;
	
	public MIRemote() {
		System.out.println("MI Remote-no argument constructor.");
	}
	
	public void displayAI() {
    	System.out.println("AI display after overiding.");
		
	}

}
