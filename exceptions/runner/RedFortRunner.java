package com.xworkz.exceptions.runner;

import java.util.Date;

import com.xworkz.exceptions.app.RedFort;
import com.xworkz.exceptions.exception.PriceException;
import com.xworkz.exceptions.exception.VisitorNameException;

public class RedFortRunner {

	public static void main(String[] args) throws VisitorNameException /*PriceException*/ /*throws Exception*/ {
		RedFort rf = new RedFort("Hari", new Date(), 100);
		System.out.println("Redfort values:"+rf.toString());
		
		if(rf.getTicketPrice()==100){
			System.out.println("Ticket price:"+rf.getTicketPrice());
			//throw new Exception();
			/* throw new PriceException("Ticket price is 100."); */
			//System.out.println("This is user defined exception ...!");
		}
		
		if(rf.getVisitorName().equals("Hari")) {
			System.out.println("Visitor name:"+rf.getVisitorName());
			throw new VisitorNameException("Person not invited !");
		}
		
		System.out.println("This is user defined exception ...!");
		
	}

}
