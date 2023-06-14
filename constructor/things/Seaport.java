package com.xworkz.constructor.things;

public class Seaport {
	public int docks;
	public int terminals;
	public String terminalName;
	public String time;
	public boolean onSchedule;
	public String coast;
	
	//default constructor
	public Seaport() {
		System.out.println("Default Constructor.");
	}
	
	//parameterized constructor
	public Seaport(int docks, int terminals, String terminalName, String time, boolean onSchedule, String coast) {
		System.out.println("Parameterized Constructor.");
		this.docks = docks;
		this.terminals = terminals;
		this.terminalName = terminalName;
		this.time = time;
		this.onSchedule = onSchedule;
		this.coast = coast;
	}
	
	public void displaySeaport() {
		System.out.println("Docks:"+this.docks+", Num of terminals:"+this.terminals+", "
				+ "Terminal Name:"+this.terminalName+", "+ "Scheduled Time:"+this.time+", "
						+ "is on Schedule?:"+this.onSchedule+", SeaCoast or OceanCoast:"+this.coast);
		
	}

}
