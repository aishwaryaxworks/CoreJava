package com.xworkz.assignments.things;

public class MovieTheatre {
	public String name;
	public double ticketPrice;
	public String movies;
	public String[] locations;
	public int[] numberOfSeats;
	public boolean[] has3DTechnology;


	public void displayTheatre1(String[] locations) {
		this.locations = locations;
		for (int i=0; i<=locations.length-1; i++) {
			System.out.println("Locations:"+this.locations[i]);
		} 
	}

	public void displayTheatre2(String[] locations, int[] numberOfSeats) {
		this.locations = locations;
		this.numberOfSeats = numberOfSeats;
		for (int i=0; i<=locations.length-1; i++) {
			System.out.println("Locations:"+this.locations[i]);
			System.out.println("Num of Seats:"+this.numberOfSeats[i]);
		} 
	}

	public void displayTheatre3(String[] locations, int[] numberOfSeats, boolean[] has3DTechnology) {
		this.locations = locations;
		this.numberOfSeats = numberOfSeats;
		this.has3DTechnology = has3DTechnology;
		for (int i=0; i<=locations.length-1; i++) {
			System.out.println("Locations:"+this.locations[i]);
			System.out.println("Num of Seats:"+this.numberOfSeats[i]);
			System.out.println("Has 3D technology:"+this.has3DTechnology[i]);
		} 
	}

	public void displayTheatre4(String name, String locations[]) {
		this.name = name;
		this.locations = locations;
		for (int i=0; i<=locations.length-1; i++) {
			System.out.println("Name:"+this.name+", Locations:"+this.locations[i]);
		} 
	}

	public void displayTheatre5(String name, double ticketPrice, String movies, String locations[]) {
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.movies = movies;
		this.locations = locations;
		for (int i=0; i<=locations.length-1; i++) {
			System.out.println("Name:"+this.name+", Ticket Price:"+this.ticketPrice+", "
					+ "Movies:"+this.movies+", Locations:"+this.locations[i]);
		} 
	}

	//No argument constructor
	public MovieTheatre() {
		System.out.println("This no argument constructor.");
		System.out.println("---------------------");
	}

	//all argument constructor
	public MovieTheatre(String name, double ticketPrice, String movies, String[] locations, 
			int[] numberOfSeats, boolean[] has3DTechnology) {
		System.out.println("This is all argument constructor.");
		System.out.println("---------------------");
	}

	//one argument constructor
	public MovieTheatre(String name) {
		this.name = name;
		System.out.println("This constructor accepts one argument.");
		System.out.println("Name:"+this.name);
		System.out.println("---------------------");
	}

	//two argument constructor 
	public MovieTheatre(String name, double ticketPrice) {
		this.name = name;
		this.ticketPrice = ticketPrice;
		System.out.println("This constructor accepts two arguments.");
		System.out.println("Name:"+this.name+", Ticket Price:"+this.ticketPrice);
		System.out.println("---------------------");
	}

	//three argument constructor 
	public MovieTheatre(String name, double ticketPrice, String movies) {
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.movies = movies;
		System.out.println("This constructor accepts three arguments.");
		System.out.println("Name:"+this.name+", Ticket Price:"+this.ticketPrice+", Movies:"+this.movies);
		System.out.println("---------------------");
	}

	//one argument constructor - array
	public MovieTheatre(String[] locations) {
		this.locations = locations;
		System.out.println("This constructor accepts one array.");
		displayTheatre1(locations);
		System.out.println("---------------------");
	}

	//two argument constructor - array
	public MovieTheatre(String[] locations, int[] numberOfSeats) {
		this.locations = locations;
		this.numberOfSeats = numberOfSeats;
		System.out.println("This constructor accepts two arrays.");
		displayTheatre2(locations, numberOfSeats);
		System.out.println("---------------------");
	}

	//three argument constructor - array
	public MovieTheatre(String[] locations, int[] numberOfSeats, boolean[] has3DTechnology) {
		this.locations = locations;
		this.numberOfSeats = numberOfSeats;
		this.has3DTechnology = has3DTechnology;
		System.out.println("This constructor accepts three arrays.");
		displayTheatre3(locations, numberOfSeats, has3DTechnology);
		System.out.println("---------------------");
	}

	//one argument - one array
	public MovieTheatre(String name, String locations[]) {
		this.name = name;
		this.locations = locations;

		System.out.println("This constructor accepts one arguement and one array.");
		displayTheatre4(name, locations);		
		System.out.println("---------------------");
	}

	//three argument - one array
	public MovieTheatre(String name, double ticketPrice, String movies, String locations[]) {
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.movies = movies;
		this.locations = locations;

		System.out.println("This constructor accepts three arguement and one array.");
		displayTheatre5(name, ticketPrice, movies, locations);		
		System.out.println("---------------------");
	}
}
