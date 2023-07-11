package com.xworkz.inheritance.things;

public class MIRemote extends ArtificialIntelligence {
	protected String model;
    protected boolean isConnected;
    protected int batteryLevel;
    protected String[] supportedCommands;
	
	public MIRemote() {
		System.out.println("MI Remote-no argument constructor.");
	}

}
