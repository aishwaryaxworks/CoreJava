package com.xworkz.afternoon.things;

public class Flag implements Cloneable {
	int price;
	String color;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Flag [price=" + price + ", color=" + color + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("This is clone method !");
		Flag flag = (Flag)super.clone(); 
		return flag;
	}
}
