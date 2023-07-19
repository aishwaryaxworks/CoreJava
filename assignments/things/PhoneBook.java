package com.xworkz.assignments.things;

public class PhoneBook extends Object{
	
	@Override
	public int hashCode() {
		return 14;		
	}
	
	@Override
	public boolean equals(Object obj1) {
		return (obj1=="+91 9876543210");		
	}
	
	@Override
	public Object clone() {
		return "Clone() overridden";
	}
	
	@Override
	public void finalize() {
		System.out.println("Finalize() overriden");
	}
	
	public static void main(String[] args) {
		PhoneBook pb1 = new PhoneBook();
		PhoneBook pb2 = new PhoneBook();
		
		//Case1
		System.out.println(pb1.getClass());
		
		//Case2
		boolean val = pb1.equals(pb2);
		System.out.println(val);
		
		//Case3
		int hscod = pb1.hashCode();
		System.out.println(hscod);
		
		//Case4
		String ts = pb1.toString();
		System.out.println(ts);
		
		//Case5
		System.out.println(pb1.clone());
		
		//Case6
		pb1.finalize();
	}

}
