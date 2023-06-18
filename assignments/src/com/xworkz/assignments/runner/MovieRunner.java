package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Movie;

public class MovieRunner {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie("Chasing Dreams","Raj Kapoor",2019,"Drama/Romance",8.2);
		movie1.displayMovie();
		movie2.displayMovie();
	}

}
