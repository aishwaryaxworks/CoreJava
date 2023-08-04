package com.xworkz.typeCasting.runner;

import com.xworkz.typeCasting.things.Bill;

public class BillRunner {

	public static void main(String[] args) {
		Bill bill = new Bill();
		
		byte bnum=34;
		bill.setNumber(bnum);
		
		//byte to int
		int billnum = bill.getNumber();
		System.out.println("Byte to int:"+billnum);
		
		//int to byte
		byte b = (byte)billnum;
		System.out.println("Int to byte:"+b);
		
		//String to int, int to string
	
		Integer value1 = new Integer(12);
		System.out.println("Number:"+value1);
		
		/*Integer value2 = new Integer("ravi");
		System.out.println("String:"+value2);
		*/
		
		String name = "ravi";
		String name2 = "567";
		//int value2 = Integer.parseInt(name);
		int value2 = Integer.parseInt(name2);
		//System.out.println("String to integer:"+value2);
		System.out.println("String to integer:"+value2);
		
		double value3 = Double.parseDouble(name2);
		System.out.println("String to double:"+value3);
		
		short value4 = Short.parseShort(name2);
		System.out.println("String to short:"+value4);
		
		long value5 = Long.parseLong(name2);
		System.out.println("String to long:"+value5);
		
		String name3 = "56";
		byte value6 = (byte)Byte.parseByte(name3);
		System.out.println("String to byte:"+value6);
		
		int value7 = Character.getNumericValue('A');
		System.out.println("Character Alphabet to character number:"+value7);
		
		boolean value8 = Boolean.parseBoolean(name3);
		System.out.println("String to boolean:"+value8);
		
		//int to string
		Integer value9 = 789;
		System.out.println("Integer to string:"+value9.toString());
		
		
	}
}
