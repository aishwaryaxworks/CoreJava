package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.MovieTheatre;

public class MovieTheatreRunner {

	public static void main(String[] args) {
		MovieTheatre theatre0 = new MovieTheatre();
		MovieTheatre theatre1 = new MovieTheatre("PVR");
		MovieTheatre theatre2 = new MovieTheatre("PVR", 78.45);
		MovieTheatre theatre3 = new MovieTheatre("PVR", 78.45, "Aadhipurush");
		
		String locations[] = {"The NEXUS Mall, Koramangala","GT World","Phoenix Marketcity Mall"};
		int[] numberOfSeats = {80, 150, 210};
		boolean[] has3DTechnology = {true, false, true};
		
		MovieTheatre theatre4 = new MovieTheatre(locations);
		MovieTheatre theatre5 = new MovieTheatre(locations, numberOfSeats);
		MovieTheatre theatre6 = new MovieTheatre(locations, numberOfSeats, has3DTechnology);
		
		MovieTheatre theatre7 = new MovieTheatre("PVR", locations);
		MovieTheatre theatre8 = new MovieTheatre("PVR", 78.45, "Aadhipurush",locations);
		MovieTheatre theatre9 = new MovieTheatre("PVR",78.45,"Aadhipurush",locations,numberOfSeats,has3DTechnology);

	}

}
