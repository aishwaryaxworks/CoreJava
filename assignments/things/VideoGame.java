package com.xworkz.assignments.things;

public class VideoGame {
	public String name;
	public boolean isMultiplayer;
	public String genre;
	public String[] platforms;
	public double[] versions;
	public double[] ratingOfVersion;

	public void displayGame1(String[] platforms) {
		this.platforms = platforms;
		for (int i=0; i<=platforms.length-1; i++) {
			System.out.println("Platforms:"+this.platforms[i]);
		} 
	}

	public void displayGame2(String[] platforms, double[] versions) {
		this.platforms = platforms;
		this.versions = versions;
		for (int i=0; i<=platforms.length-1; i++) {
			System.out.println("Platforms:"+this.platforms[i]);
			System.out.println("Versions:"+this.versions[i]);
		} 
	}

	public void displayGame3(String[] platforms, double[] versions, double[] ratingOfVersion) {
		this.platforms = platforms;
		this.versions = versions;
		this.ratingOfVersion = ratingOfVersion;
		for (int i=0; i<=platforms.length-1; i++) {
			System.out.println("Platforms:"+this.platforms[i]);
			System.out.println("Versions:"+this.versions[i]);
			System.out.println("Rating of each version:"+this.ratingOfVersion[i]);
		} 
	}

	public void displayGame4(String name, String platforms[]) {
		this.name = name;
		this.platforms = platforms;
		for (int i=0; i<=platforms.length-1; i++) {
			System.out.println("Name:"+this.name+", Platforms:"+this.platforms[i]);
		} 
	}

	public void displayGame5(String name, boolean isMultiplayer, String genre, String platforms[]) {
		this.name = name;
		this.isMultiplayer = isMultiplayer;
		this.genre = genre;
		this.platforms = platforms;
		for (int i=0; i<=platforms.length-1; i++) {
			System.out.println("Name:"+this.name+", Is it Multiplayer:"+this.isMultiplayer+", "
					+ "Genre:"+this.genre+", Platforms:"+this.platforms[i]);
		} 
	}

	//No argument constructor
	public VideoGame() {
		System.out.println("This no argument constructor.");
		System.out.println("---------------------");
	}

	//all argument constructor
	public VideoGame(String name, boolean isMultiplayer, String genre, String platforms[], double[] versions,
			double[] ratingOfVersion) {
		System.out.println("This is all argument constructor.");
		System.out.println("---------------------");
	}

	//one argument constructor
	public VideoGame(String name) {
		this.name = name;
		System.out.println("This constructor accepts one argument.");
		System.out.println("Title:"+this.name);
		System.out.println("---------------------");
	}

	//two argument constructor 
	public VideoGame(String name, boolean isMultiplayer) {
		this.name = name;
		this.isMultiplayer = isMultiplayer;
		System.out.println("This constructor accepts two arguments.");
		System.out.println("Name:"+this.name+", Is it Multiplayer:"+this.isMultiplayer);
		System.out.println("---------------------");
	}

	//three argument constructor 
	public VideoGame(String name, boolean isMultiplayer, String genre) {
		this.name = name;
		this.isMultiplayer = isMultiplayer;
		this.genre = genre;
		System.out.println("This constructor accepts three arguments.");
		System.out.println("Name:"+this.name+", Is it Multiplayer:"+this.isMultiplayer+", Genre:"+this.genre);
		System.out.println("---------------------");
	}

	//one argument constructor - array
	public VideoGame(String[] platforms) {
		this.platforms = platforms;
		System.out.println("This constructor accepts one array.");
		displayGame1(platforms);
		System.out.println("---------------------");
	}

	//two argument constructor - array
	public VideoGame(String[] platforms, double[] versions) {
		this.platforms = platforms;
		this.versions = versions;
		System.out.println("This constructor accepts two arrays.");
		displayGame2(platforms, versions);
		System.out.println("---------------------");
	}

	//three argument constructor - array
	public VideoGame(String[] platforms, double[] versions, double[] ratingOfVersion) {
		this.platforms = platforms;
		this.versions = versions;
		this.ratingOfVersion = ratingOfVersion;
		System.out.println("This constructor accepts three arrays.");
		displayGame3(platforms, versions, ratingOfVersion);
		System.out.println("---------------------");
	}

	//one argument - one array
	public VideoGame(String name, String[] platforms) {
		this.name = name;
		this.platforms = platforms;

		System.out.println("This constructor accepts one arguement and one array.");
		displayGame4(name, platforms);		
		System.out.println("---------------------");
	}

	//three argument - one array
	public VideoGame(String name, boolean isMultiplayer, String genre, String[] platforms) {
		this.name = name;
		this.isMultiplayer = isMultiplayer;
		this.genre = genre;
		this.platforms = platforms;

		System.out.println("This constructor accepts three arguement and one array.");
		displayGame5(name, isMultiplayer, genre, platforms);		
		System.out.println("---------------------");
	}
}
