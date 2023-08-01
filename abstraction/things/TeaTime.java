package com.xworkz.abstraction.things;

import java.util.Date;

public abstract class TeaTime {
	public String type;
	public String location;
	public int price;
	public Date date;
	
	public TeaTime() {
		System.out.println("This is TeaTime constructor.");
	}
	
	//concrete methods or normal methods
	public void wastingTime() {
		System.out.println("you guys are wasting time...");
	}
	
	public void goodTime() {
		System.out.println("you guys are having good time...");
	}
	
	public void review() {
		System.out.println("normal...........");
	}
	
	//abstract methods
	
	public abstract void waiting();
}
