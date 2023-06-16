package com.xworkz.constructor.things;

public class BlackTicket {
	public int price;
	public String sellerName;
	public String buyerName;
	public String location;
	
	public BlackTicket() {
		this(120);
		System.out.println("No argument constructor.");
	}
	
	public BlackTicket(int price) {
		this(120, "hari");
		this.price = price;
		System.out.println("1 argument constructor.");
		System.out.println("Price"+this.price);
	}
	
	public BlackTicket(int price, String sellerName) {
		this(120, "hari","sarvesh");
		this.price = price;
		this.sellerName = sellerName;
		System.out.println("2 argument constructor.");
		System.out.println("Price:"+this.price+", Seller Name:"+this.sellerName);
	}
	
	public BlackTicket(int price, String sellerName, String buyerName) {
		this(120, "hari","sarvesh","BTM layout");
		this.price = price;
		this.sellerName = sellerName;
		this.buyerName = buyerName;
		System.out.println("3 argument constructor.");
		System.out.println("Price:"+this.price+", Seller Name:"+this.sellerName+", Buyer name:"+this.buyerName);
	}
	
	public BlackTicket(int price, String sellerName, String buyerName, String location) {
		this.price = price;
		this.sellerName = sellerName;
		this.buyerName = buyerName;
		this.location = location;
		System.out.println("4 argument constructor.");
		System.out.println("Price:"+this.price+", Seller Name:"+this.sellerName+", Buyer name"
				+ ":"+this.buyerName+", Location:"+this.location);
	}
	
	/*
	public void display() { 
	 System.out.println(this.sellerName);
	 System.out.println(this.buyerName); 
	 System.out.println(this.location);
	 System.out.println(this.price);
	 }
	 */

}
