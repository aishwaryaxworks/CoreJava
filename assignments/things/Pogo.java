package com.xworkz.assignments.things;

public class Pogo {
	private String cartoonName;
	private String characterName;
	private String description;
	private int numOfCharacters;
	private String writer;
	private boolean isAvailableOnline;
	private boolean isMultiLanguage;
	private boolean isComicBookOriginated;
	private int rating;

	public void powerOn() {
		System.out.println("Power on method.");
	}

	public void powerOff() {
		System.out.println("Power off method.");
	}

	public void playMusic() {
		System.out.println("Play music method.");
	}

	public void adjustVolume() {
		System.out.println("Adjust volume method.");
	}

	public void changeCartoon() {
		System.out.println("Change cartoon method.");
	}

	public Pogo() {
		System.out.println("No-argument constructor.");
		System.out.println("---------------------------------------");
	}

	public Pogo(String cartoonName, String characterName, String description, int numOfCharacters, String writer,
			boolean isAvailableOnline, boolean isMultiLanguage, boolean isComicBookOriginated, int rating) {
		this.cartoonName = cartoonName;
		this.characterName = characterName;
		this.description = description;
		this.numOfCharacters = numOfCharacters;
		this.writer = writer;
		this.isAvailableOnline = isAvailableOnline;
		this.isMultiLanguage = isMultiLanguage;
		this.isComicBookOriginated = isComicBookOriginated;
		this.rating = rating;
		System.out.println("All-argument constructor.");
		System.out.println("Model Name: " + this.cartoonName + ", Charcter Name: " + this.characterName + ", "
				+ "Description: "+ this.description + ", Quantity: " + this.numOfCharacters + ", Manufacturer: "
						+ "" + this.writer+ ", Is Available online? " + this.isAvailableOnline + ", Is Multi "
								+ "Language? " + this.isMultiLanguage+ ", Is Comic Book "
										+ "Originated?: "+ this.isComicBookOriginated + ", " + "Rating: "+ this.rating);
	}

	public void setCartoonName(String cartoonName) {
		this.cartoonName = cartoonName;
	}

	public String getCartoonName() {
		return this.cartoonName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterName() {
		return this.characterName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setNumOfCharacters(int numOfCharacters) {
		this.numOfCharacters = numOfCharacters;
	}

	public int getNumOfCharacters() {
		return this.numOfCharacters;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setIsAvailableOnline(boolean isAvailableOnline) {
		this.isAvailableOnline = isAvailableOnline;
	}

	public boolean getIsAvailableOnline() {
		return this.isAvailableOnline;
	}

	public void setIsMultiLanguage(boolean isMultiLanguage) {
		this.isMultiLanguage = isMultiLanguage;
	}

	public boolean getIsMultiLanguage() {
		return this.isMultiLanguage;
	}

	public void setIsComicBookOriginated(boolean isComicBookOriginated) {
		this.isComicBookOriginated = isComicBookOriginated;
	}

	public boolean getIsComicBookOriginated() {
		return this.isComicBookOriginated;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRating() {
		return this.rating;
	}
}
