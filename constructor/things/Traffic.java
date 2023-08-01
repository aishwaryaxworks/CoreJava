package com.xworkz.constructor.things;

public class Traffic {
	public String areaName;
	public long vehicleNumber;
	public int numOfSignals;
	public int numOfVehicles;
	public boolean crowded;
	public boolean isCameraSurveillanced;
	public String report;
	public boolean isPoliceControlled;
	public int numOfAccidents;
	public String navigationTowards;
	
	public Traffic(String areaName, long vehicleNumber, int numOfSignals,int numOfVehicles,boolean crowded,
			boolean isCameraSurveillanced,String report,boolean isPoliceControlled, int numOfAccidents,
			String navigationTowards) {
		this.areaName = areaName;
		this.vehicleNumber = vehicleNumber;
		this.numOfSignals = numOfSignals;
		this.numOfVehicles = numOfVehicles;
		this.crowded = crowded;
		this.isCameraSurveillanced = isCameraSurveillanced;
		this.report = report;
		this.isPoliceControlled = isPoliceControlled;
		this.numOfAccidents = numOfAccidents;
		this.navigationTowards = navigationTowards;
		System.out.println("All argument constructor.");
		
		displayTraffic();
		System.out.println("----------------------------------------");
	}
	
	public void displayTraffic(){
		System.out.println("Area Name:"+areaName);
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Number of Signals:"+numOfSignals);
		System.out.println("Number of Vehicles:"+numOfVehicles);
		System.out.println("Is it crowded?:"+crowded);
		System.out.println("Is it Camera Surveillance:"+isCameraSurveillanced);
		System.out.println("Report:"+report);
		System.out.println("Is police controlled?:"+isPoliceControlled);
		System.out.println("Number of Accidents:"+numOfAccidents);
		System.out.println("Navigating Towards:"+navigationTowards);
		
	}
}
