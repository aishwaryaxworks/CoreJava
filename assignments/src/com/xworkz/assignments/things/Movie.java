package com.xworkz.assignments.things;

public class Movie {
	public String title;
	public String director;
	public int releaseYear;
	public String genre;
	public double rating;
	
	//default constructor
	public Movie() {
		System.out.println("------Default Constructor.-----");
	}

	//parameterized constructor
	public Movie(String title, String director, int releaseYear, String genre, double rating) {
		System.out.println("-----Parameterized Constructor.-----");
		this.title = title;
		this.director = director;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.rating = rating;		
	}

	public void displayMovie() {
		System.out.println("Title:"+this.title+", Director:"+this.director+", Release Year:"+this.releaseYear+
				", Genre:"+this.genre+", Rating:"+this.rating);
	}
}
