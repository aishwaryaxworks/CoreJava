package com.xworkz.assignments.things;

public class MovieMaker {
	String director;
	String producer;
	String title;
	int releaseYear;
	double budget;
	String genre;
	int durationMinutes;
	boolean isReleased;
	String[] cast;
	boolean hasSpecialEffects;

	public MovieMaker() {
		System.out.println(getClass());
		System.out.println("MovieMaker class constructor.");
	}

	public MovieMaker(String director, String producer, String title, int releaseYear, double budget, String genre,
			int durationMinutes, boolean isReleased, String[] cast, boolean hasSpecialEffects) {
		this.director = director;
		this.producer = producer;
		this.title = title;
		this.releaseYear = releaseYear;
		this.budget = budget;
		this.genre = genre;
		this.durationMinutes = durationMinutes;
		this.isReleased = isReleased;
		this.cast = cast;
		this.hasSpecialEffects = hasSpecialEffects;
	}

	@Override
	public String toString() {
		return "MovieMaker [director:'"+director+"', producer:'"+producer+"', title:'"+title+"', release year:'"+releaseYear+"', "
				+ "budget:'"+budget+"', genre:'"+genre+"', duration:'"+durationMinutes+"', is released?:'"+isReleased+", "
				+ "cast:'"+cast+", has special effects:'"+hasSpecialEffects+"']";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		MovieMaker mm = (MovieMaker)obj;
		if(this.director == mm.director && this.producer == mm.producer && this.title == mm.title && this.releaseYear == 
				mm.releaseYear && this.budget == mm.budget && this.genre == mm.genre && this.durationMinutes == 
				mm.durationMinutes && this.isReleased == mm.isReleased && this.cast == mm.cast && this.hasSpecialEffects == 
				mm.hasSpecialEffects)
			return true;
		return false;
	}

}
