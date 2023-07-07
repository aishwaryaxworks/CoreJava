package com.xworkz.inheritance.things;

public class WhatsappV3 extends WhatsappV2{
	protected int numOfUpdates;
	
	static {
		System.out.println("Static block of Whatsapp v3.");
	}
	
	{
		System.out.println("Instance block of Whatsapp v3.");
	}
	
	public WhatsappV3() {
		System.out.println("Whatsapp v3 - no argument constructor.");
	}
}
