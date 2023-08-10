package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.interfaces.Product;
import com.xworkz.interfaces.things.ProductClass;

public class ProductRunner {
	
	public Product product;
	
	public static void main(String[] args) {
		ProductClass prod1 = new ProductClass();
		String result=prod1.getProductDetails();
		System.out.println(result);
		
		int value = prod1.setProduct();
		System.out.println(value);
		
		Product.selling();
	}

}
