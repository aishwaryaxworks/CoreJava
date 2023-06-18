package com.xworkz.assignments.things;

public class MusicAlbum {
	public String title;
	public String artist;
	public int releaseYear;
	public String genre;
	public int numberOfTracks;
	
	//default constructor
		public MusicAlbum() {
			System.out.println("------Default Constructor.-----");
		}
		
		//parameterized constructor
		public MusicAlbum(String title, String artist, int releaseYear, String genre, int numberOfTracks) {
			System.out.println("-----Parameterized Constructor.-----");
			this.title = title;
			this.artist = artist;
			this.releaseYear = releaseYear;
			this.genre = genre;
			this.numberOfTracks = numberOfTracks;		
		}
		
		public void displayAlbum() {
			System.out.println("Title:"+this.title+", Artist:"+this.artist+", Release Year:"+this.releaseYear
					+", Genre:"+this.genre+", Num of Tracks:"+this.numberOfTracks);
		}

}
