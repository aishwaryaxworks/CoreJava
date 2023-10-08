package com.xworks.may19th.things;

public class Flag {
	private String colors;
	private String types;
	private String countryName;
	private double height;
	private double width;
	private int price;
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Flag [colors=" + colors + ", types=" + types + ", countryName=" + countryName + ", height=" + height
				+ ", width=" + width + ", price=" + price + "]";
	}
	
	
}
