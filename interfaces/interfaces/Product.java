package com.xworkz.interfaces.interfaces;

public interface Product {
	// by default it will be considered as final or static
	final int productId=1;
//	static String productName="Java";       OR
	final static String productName="Java";
	
	//method with only abstract is accepted
	String getProductDetails() ;
	
	//methods with default will be used to write body
	default int setProduct() {
		return 10;
	}
	
	// apart from instance methods will be accepted
	public static void selling() {
		System.out.println("Static methods in product interface.");
	}

}
