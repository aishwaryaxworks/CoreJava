package com.xworkz.assignments.things;

public class Amazon {
	private String productName;
	private double price;
	private String description;
	private int quantity;
	private String sellerName;
	private String category;
	private boolean isAvailable;
	private boolean isPrimeEligible;
	private boolean isDiscounted;
	private int rating;

	public void addToCart() {
		System.out.println("Add to cart method.");
	}

	public void buyNow() {
		System.out.println("Buy now method.");
	}

	public void leaveReview(String review) {
		System.out.println("Leave review method.");
	}

	public void checkAvailability() {
		System.out.println("Check availability method.");
	}

	public void applyDiscount() {
		System.out.println("apply discount method.");
	}

	public Amazon() {
		System.out.println("No argument constructor.");
		System.out.println("---------------------------------------");
	}

	public Amazon(String productName, double price, String description, int quantity, String sellerName,
			String category, boolean isAvailable, boolean isPrimeEligible, boolean isDiscounted, int rating) {
		this.productName = productName;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
		this.sellerName = sellerName;
		this.category = category;
		this.isAvailable = isAvailable;
		this.isPrimeEligible = isPrimeEligible;
		this.isDiscounted = isDiscounted;
		this.rating = rating;
		System.out.println("All argument constructor.");
		System.out.println("Product Name:"+this.productName+", Price:"+this.price+", Description:"
				+ ""+this.description+", Quantity:"+this.quantity+", Seller name:"+this.sellerName+", Category:"
				+ ""+this.category+", Is Available?:"+this.isAvailable+", Is Prime Eligible?:"
						+ ""+this.isPrimeEligible+", Is Discounted?:"+this.isDiscounted+", Rating:"+this.rating);
	}

	public void setProductName(String productName) {
		this.productName=productName;
	}

	public String productName() {
		return this.productName;
	}

	public void setPrice(double price) {
		this.price=price;
	}

	public double price() {
		return this.price;
	}

	public void setDescription(String description) {
		this.description=description;
	}

	public String description() {
		return this.description;
	}

	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}

	public int quantity() {
		return this.quantity;
	}

	public void setSellerName(String sellerName) {
		this.sellerName=sellerName;
	}

	public String sellerName() {
		return this.sellerName;
	}

	public void setCategory(String category) {
		this.category=category;
	}

	public String category() {
		return this.category;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable=isAvailable;
	}

	public boolean isAvailable() {
		return this.isAvailable;
	}

	public void setIsPrimeEligible(boolean isPrimeEligible) {
		this.isPrimeEligible=isPrimeEligible;
	}

	public boolean isPrimeEligible() {
		return this.isPrimeEligible;
	}

	public void setIsDiscounted(boolean isDiscounted) {
		this.isDiscounted=isDiscounted;
	}

	public boolean isDiscounted() {
		return this.isDiscounted;
	}

	public void setRating(int rating) {
		this.rating=rating;
	}

	public int rating() {
		return this.rating;
	}

}

