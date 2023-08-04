package com.xworkz.interfaces.things;

import com.xworkz.interfaces.interfaces.Product;

public class ProductClass implements Product{
	
	public ProductClass() {
		System.out.println("Java Class constructor.");
	}
	
	@Override
	public String getProductDetails() {
		return "This is get product method of interface overridden in class";
	}
	
	
}
