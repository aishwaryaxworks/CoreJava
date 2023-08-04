package com.xworkz.assignment2.things;

public class Product {
	public double price;
	public int quantity;
	public double gst;
	public double sst;
	public double ist;
	public boolean review;

	// all argument constructor
	public Product(double price, int quantity, double gst, double sst, double ist, boolean review) {
		this.price = price;
		this.quantity = quantity;
		this.gst = gst;
		this.sst = sst;
		this.ist = ist;
		this.review = review;
	}

	// calculate total price with taxes based on the review
	public double calculateTotalPrice() {
		double totalPrice = price * quantity;
		if (review==true) {
			totalPrice += totalPrice * (gst / 100);
			totalPrice += totalPrice * (sst / 100);
			totalPrice += totalPrice * (ist / 100);
		}
		return totalPrice;
	}

	// check if the user will buy the product based on the review
	public boolean willBuy() {
		if (review==true) {
			double totalPrice = calculateTotalPrice();
			System.out.println("Total Price with Taxes: " + totalPrice);
		} else {
			System.out.println("The review is not good. User won't buy the product.");
		}
		return review;
	}

	public static void main(String[] args) {
		Product product1 = new Product(100.0, 2, 5.0, 8.0, 2.0, true);
		product1.willBuy();

		Product product2 = new Product(25.65,5,8.1,2.1,2,false);
		product2.willBuy();

	}
}

