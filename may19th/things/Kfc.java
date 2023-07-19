package com.xworks.may19th.things;

public class Kfc {

	public String location;
	public final int numberOfEmployees = 50;
	public double revenue;
	public boolean isOpen;
	public final int seatingCapacity=250;
	public boolean hasDriveThru;
	public boolean isFranchise;
	public final boolean isDeliveryAvailable=true;
	public KfcMenu menu;
	public String[] employeeName;

	public Kfc() {
		//constructor
	}
	
	public void sampleMethod() {
		System.out.println("Visit KFC app or store !");		
	}
	
	public void open() {
		if(isOpen == true) {
			System.out.println("KFC at "+this.location+" is now open.");
		}else
			System.out.println("KFC at "+this.location+" is now closed.");
	}

	public void franchise() {
		if(isFranchise == true) {
			System.out.println("KFC at "+this.location+" has franchise.");
		}
	}

	public void employees() {
		System.out.println("No. of employees:"+this.numberOfEmployees);	
	}

	public void employee(String[] employeeName) {
		this.employeeName = employeeName;
		System.out.println("Employees:"+employeeName);
		
	}

	public void menuList() {
		System.out.println("Serving Menu: " +this.menu);
	}

	public void delivery() {
		System.out.println("Order out for delivery !");
	}

	public void seating() {
		System.out.println("Seating capacity is :"+this.seatingCapacity);
	}

	public void profit(double amount) {
		revenue += amount;
		System.out.println("Updated profit: " +this.revenue);
	}

	public void deliveryAvailable() {
		System.out.println("Delivery is available.");;
	}
}
