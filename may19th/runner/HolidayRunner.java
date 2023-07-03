package com.xworks.may19th.runner;

import com.xworks.may19th.things.Holiday; //Single import or Explicit import (Class specified explicitly)
//import com.xworks.may19th.things.*; //multiple import or implicit or wild-card or inline import
//import com.xworks.may19th.things.Holiday.;

import java.util.Calendar;

import static com.xworks.may19th.things.Holiday.getPermission;

public class HolidayRunner {

	public static void main(String[] args) {
		System.out.println("This is Holiday runner class.");
		
		Holiday holiday1 = new Holiday();
		Holiday.getPermission(true);
		
		System.out.println(Calendar.APRIL);
		int am = Calendar.AM;
		System.out.println(am);
		
//		com.xworks.may19th.things.Holiday holiday1 = new com.xworks.may19th.things.Holiday();
//		com.xworks.may19th.things.Holiday holiday2 = new com.xworks.may19th.things.Holiday();
//		com.xworks.may19th.things.Holiday holiday3 = new com.xworks.may19th.things.Holiday();

	}

}
