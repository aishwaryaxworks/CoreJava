package com.xworkz.exceptions.app;

public class EventCreator {

	public void method1() {
		System.out.println("Running method 1...");
		method2();
		System.out.println("Exit method 1...");
	}

	public void method2() {
		System.out.println("Running method 2...");
		method3();
		System.out.println("Exit method 2...");
	}

	public void method3() {
		System.out.println("Running method 3...");
		try {
			System.out.println("Before method 4...");
			method4();
			System.out.println("After method 4...");
		} catch (NullPointerException ne) {
			System.err.println("catch null pointer exception in method 4...");
		}

		System.out.println("Exit method 3...");
	}

	public void method4() {
		System.out.println("Running method 4...");
		// try {
		System.out.println("Inisde try before method 5...");
		method5();
		System.out.println("Inisde try after method 5...");
		// } catch (Throwable th) {
		System.err.println("Inside catch, event is matched...");
		// }
		System.out.println("Exit method 4...");
	}

	public void method5() {
		System.out.println("Running method 5...");
		throw new NullPointerException("Learning event handling... from method 5...");
		// exception is not handled : not throws or try catch block
	}
}
