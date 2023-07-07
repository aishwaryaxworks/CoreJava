package com.xworkz.inheritance.things;

public class WhatsappV2 extends Whatsapp{
//	public String personName;//hiding the base class property
	protected String reactions;
	
	static {
		System.out.println("Static block of Whatsapp v2");
	}
	
	{
		System.out.println("Instance block of Whatsappv2.");
	}
	
	public WhatsappV2() {
		System.out.println("Whatsapp v2 - no argument cosntructor.");
	}

}
