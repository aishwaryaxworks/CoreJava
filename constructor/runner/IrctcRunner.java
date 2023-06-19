package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Irctc;

public class IrctcRunner {

	public static void main(String[] args) {
		Irctc ticket0 = new Irctc();
		System.out.println("Name:"+ticket0.name);
		System.out.println("Price:"+ticket0.price);
		System.out.println("Location:"+ticket0.location);
		System.out.println("Seat num:"+ticket0.seatNumber);
		System.out.println("----------------");
		
		Irctc ticket1 = new Irctc("Aishwarya", 480, "Bellary", "F23");
		
		System.out.println("Name:"+ticket1.name);
		System.out.println("Price:"+ticket1.price);
		System.out.println("Location:"+ticket1.location);
		System.out.println("Seat num:"+ticket1.seatNumber);
		System.out.println("----------------");
		
		//assigning values to variable through reference.
		Irctc ticket2 = new Irctc();
		ticket2.name="Sagar";
		ticket2.price=580;
		ticket2.location="Dharwad";
		ticket2.seatNumber="C12";
		System.out.println("Name:"+ticket2.name);
		System.out.println("Price:"+ticket2.price);
		System.out.println("Location:"+ticket2.location);
		System.out.println("Seat num:"+ticket2.seatNumber);
		System.out.println("----------------");
		
		Irctc ticket3 = new Irctc();
		ticket3.setName("Ravi");
		System.out.println("Name:"+ticket3.name);
		System.out.println("Price:"+ticket3.price);
		System.out.println("Location:"+ticket3.location);
		System.out.println("Seat num:"+ticket3.seatNumber);

	}

}
