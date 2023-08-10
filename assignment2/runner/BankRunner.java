package com.xworkz.assignment2.runner;

import java.util.Date;

import com.xworkz.assignment2.things.FD;
import com.xworkz.assignment2.things.RD;
import com.xworkz.assignment2.things.Savings;

public class BankRunner {
	public static void main(String[] args) {
		//type 1 of object creation
		Savings savings1 = new Savings();
		savings1.setAmt(54654);
		savings1.setEndDate(new Date());
		savings1.setStartDate(new Date());
		System.out.println(savings1.toString());
		
		//association object creation
		FD fd = new FD(new Savings());
		System.out.println(fd.getAmt());
		System.out.println(fd.getSavings().toString());
		
		RD rd = new RD(new Savings());
		rd.getSavings().setEndDate(new Date());
		System.out.println(rd.getSavings().getEndDate());
		
	}

}
