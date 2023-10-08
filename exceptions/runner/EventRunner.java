package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.app.EventCreator;

public class EventRunner {

	//programs use or needs resources: class
	public static void main(String[] args) {
		System.out.println("Running main method...");
		EventCreator ec = new EventCreator();
		ec.method1();
		System.out.println("Exist main method...");
		
		try {
			System.out.println("inside try...");
			//throw new NullPointerException();
			//throw new ClassCastException();
			//throw new ArrayIndexOutOfBoundsException();
			//return;
			System.exit(65);
		}
		catch(NullPointerException | ClassCastException e) {
			//System.out.println("Inside catch Null Pointer Exception...");
			System.out.println("Inside catch ...");
		}
		/*
		 * catch(ClassCastException e) {
		 * System.out.println("Inside catch class cast..."); }
		 */
		finally {
			System.out.println("Inside finally...");
		}
		
	}
}
