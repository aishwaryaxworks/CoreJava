package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.app.NameException;
import com.xworkz.exceptions.exception.PriceException;

public class ExceptionRunner {
	public static void main(String[] args) throws PriceException {

		// try with catch block
		try {
			int[] number = { 1, 2, 3, 4, 5 };
			System.out.println("this is array index out of bound exception...");
			
			try {          /* inner try catch block or nested try catch block */
				throw new NameException();
				// throw new NameException("Named custom exception occurred");
			} catch (NameException ne) {
				System.out.println("Named custom exception occurred...");
			}
			
			System.out.println(number[6]);
			
		} catch (ArrayIndexOutOfBoundsException arr) {
			System.out.println(arr.getCause());
			System.out.println(arr.getMessage());
			arr.printStackTrace();
		}
		
		/*
		 * try { throw new PriceException("This is price exception..."); 
		 * }finally {
		 * System.out.println("This is finally block..."); 
		 * }
		 */
		
		try {
			throw new PriceException("this is price exception...");
		}catch(PriceException pe) {
			System.out.println("Price exception occurred...");
		}finally {
			System.out.println("This is finally block...");
		}
		
		//System.out.println("this is exception end");

	}
}
