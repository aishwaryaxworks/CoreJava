package com.xworkz.techquest.things;

import java.util.Scanner;

public class test1 {
	public final String email="test@gmail.com";
	public final String password="test";
	//public int[] ticket= new int[10]
	public int[] ticket= {1,2,3,4,5,6,7,8,9,10};

	public test1() {
		// no argument constructor
	}

	//email matching
	public test1(int[] ticket, String email, String password) {
		this.ticket = ticket;
		if(this.email.equals(email) && this.password.equals(password)) {
			System.out.println("Welcome to book my show, "+email);
		}else {
			System.out.println("Email or password mismatched!");
		}
		System.out.println("-------------------------");
	}

	//book tickets

	/*public void bookTickets(String email, String password) {
		if(this.email.equals(email) && this.password.equals(password)) {
			for(int i=0; i<this.ticket.length;i++) {
				System.out.println("Select seats!");
			}
		}else {
			System.out.println("Email or password mismatched!");
		}
		System.out.println("-------------------------");
	}*/

	public void bookTickets(String email, String password, int seatnumber) {
		int seatbooked;
		if(this.email.equals(email) && this.password.equals(password)) {
			for(int i=0;i<seatnumber;i++) {
				if(seatnumber<=10 && seatnumber==this.ticket[i]) {
					System.out.println("SeatBooked : "+seatnumber);
					seatbooked=this.ticket[i];
					System.out.println("Booked seat number is: "+seatbooked);
					break;
				}
				else {
					System.out.println("Seats fully booked!");
				}
			}
		}
	}

	//display tickets
	/*public void displayTickets(int[] ticket) {
		this.ticket=ticket;
		for(int i=0; i<ticket.length;i++) {
			if(ticket.length<=10) {
				int bookedTickets=ticket[i];
				System.out.println("Booked seats are:"+bookedTickets);
			}else {
				System.out.println("OverBooked!");
			}
			System.out.println("-------------------------");
		}

	}*/

	public static void main(String[] args) {
		int[] tickets1= {123,234,345,456};
		test1 book = new test1(tickets1,"test@gmail.com","test");
		//book.bookTickets("abcd@gmail.com", "abcd");
		//book.displayTickets(tickets1);

		int[] tickets2= {1,2,3,4,5,6,7,8,9,10};
		test1 book2 = new test1(tickets2,"test@gmail.com","test") ;
		book2.bookTickets("test@gmail.com", "test", 1);
		//book2.displayTickets(tickets2);

		int[] tickets3= {1,2,3,4,5,6,7,8,9,10,11,12};
		test1 book3 = new test1(tickets3,"test@gmail.com","test");
		//book3.displayTickets(tickets3);
	}

}
