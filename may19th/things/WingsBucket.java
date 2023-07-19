package com.xworks.may19th.things;

public class WingsBucket extends Kfc {
	Kfc kfc = new Kfc();

	public WingsBucket() {
		Kfc kfc1 = new Kfc();
		kfc1.sampleMethod();
	}

	@Override
	public void sampleMethod() {
		System.out.println("Visit KFC app or store ! ---- WingsBucket method");
	}

	@Override
	public void open() {
		if (isOpen == true) {
			System.out.println("KFC at " + this.location + " is now open. ---- WingsBucket method");
		} else
			System.out.println("KFC at " + this.location + " is now closed. ---- WingsBucket method");
	}

	@Override
	public void franchise() {
		System.out.println("KFC has no franchise.");
	}

	@Override
	public void employees() {
		System.out.println("No. of employees:" + this.numberOfEmployees + " ---- WingsBucket method");
	}

	@Override
	public void employee(String[] employee) {
		Kfc kfc2 = new Kfc();
		kfc2.employeeName = employee;
		System.out.println("Employees:" + kfc2.employeeName + " ---- WingsBucket method");
	}

	@Override
	public void menuList() {
		System.out.println("Serving Menu: " + kfc.menu + " ---- WingsBucket method");
	}

	@Override
	public void delivery() {
		System.out.println("Order out for delivery ! ---- WingsBucket method");
	}

	@Override
	public void seating() {
		System.out.println("Seating capacity is :" + kfc.seatingCapacity + " ---- WingsBucket method");
	}

	@Override
	public void profit(double amount) {
		revenue *= amount;
		System.out.println("Updated profit: " + revenue + " ---- WingsBucket method");
	}

	@Override
	public void deliveryAvailable() {
		System.out.println("Delivery unavailable!");
	}
}
