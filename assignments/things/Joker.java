package com.xworkz.assignments.things;

public class Joker {
	String name;
	int age;
	String favoriteQuote;
	String catchphrase;
	String outfitColor;
	boolean hasGagProps;
	int numberOfLaughs;
	boolean isEvil;

	public Joker() {
		System.out.println(getClass());
		System.out.println("Joker class constructor.");
	}

	public Joker(String name, int age, String favoriteQuote, String catchphrase, String outfitColor,boolean hasGagProps, 
			int numberOfLaughs, boolean isEvil) {
		this.name = name;
		this.age = age;
		this.favoriteQuote = favoriteQuote;
		this.catchphrase = catchphrase;
		this.outfitColor = outfitColor;
		this.hasGagProps = hasGagProps;
		this.numberOfLaughs = numberOfLaughs;
		this.isEvil = isEvil;
	}
	
	@Override
	public String toString() {
		return "Joker [name:'"+name+"', age:'"+age+"', favorite Quote:'"+favoriteQuote+"', catch phrase:'"+catchphrase+"', "
				+ "outfit Color:'"+outfitColor+"', has Gag Props:'"+hasGagProps+"', number Of Laughs:'"+numberOfLaughs+"', "
						+ "is Evil:'"+isEvil+"']";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Joker j = (Joker)obj;
		if(this.name == j.name && this.age == j.age && this.favoriteQuote == j.favoriteQuote && this.catchphrase == 
				j.catchphrase && this.outfitColor == j.outfitColor && this.hasGagProps == j.hasGagProps && 
				this.numberOfLaughs == j.numberOfLaughs && this.isEvil == j.isEvil)
			return true;
		return false;
	}

}
