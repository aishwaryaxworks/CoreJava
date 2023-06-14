package com.xworkz.constructor.things;

public class MusicAlbum {
	public String albumName;
	public String artistName;
	public String artistURL;
	public boolean CD;
	public int songs;
	public float albumRating;
	public boolean availableonline;
	public String onlinePlatform;
	
	//default constructor
	public MusicAlbum() {
		System.out.println("This is default constructor.");
	}
	
	public MusicAlbum(String name) {
		System.out.println("Parameters:1---------------------------");
		this.albumName = name;
		System.out.println("Album name:"+this.albumName);
	}
		
	public MusicAlbum(String albumName,String artistName) {
		System.out.println("Parameters:2---------------------------");
		this.albumName = albumName;
		this.artistName = artistName;
		System.out.println("Album:"+this.albumName+" Artist:"+this.artistName);
	}
	
	public MusicAlbum(String albumName, String artistName, boolean availableOnline) {
		System.out.println("Parameters:3---------------------------");
		this.albumName = albumName;
		this.artistName = artistName;
		this.availableonline = availableOnline;
		System.out.println("Album:"+this.albumName+", Artist:"+this.artistName+", is "
				+ "it Available Online:"+this.availableonline);
	}
	
	public MusicAlbum(String albumName, String artistName, boolean availableOnline, boolean CD) {
		System.out.println("Parameters:4---------------------------");
		this.albumName = albumName;
		this.artistName = artistName;
		this.availableonline = availableOnline;
		this.CD = CD;
		System.out.println("Album:"+this.albumName+", Artist:"+this.artistName+", is "
				+ "it Available Online:"+this.availableonline+", is CD available:"+this.CD);
	}
	
	public MusicAlbum(String albumName, String artistName, boolean availableOnline, boolean CD, String artistURL) {
		System.out.println("Parameters:5---------------------------");
		this.albumName = albumName;
		this.artistName = artistName;
		this.availableonline = availableOnline;
		this.CD = CD;
		this.artistURL = artistURL;
		System.out.println("Album:"+this.albumName+", Artist:"+this.artistName+", is "
				+ "it Available Online:"+this.availableonline+", is CD available:"+this.CD+", "
						+ "About artist:"+this.artistURL);
	}
	
	public MusicAlbum(String albumName, String artistName, boolean availableOnline, boolean CD, 
			String artistURL, int songs) {
		System.out.println("Parameters:6---------------------------");
		this.albumName = albumName;
		this.artistName = artistName;
		this.availableonline = availableOnline;
		this.CD = CD;
		this.artistURL = artistURL;
		this.songs = songs;
		System.out.println("Album:"+this.albumName+", Artist:"+this.artistName+", is "
				+ "it Available Online:"+this.availableonline+", is CD available:"+this.CD+", "
						+ "About artist:"+this.artistURL+", Num of Songs:"+this.songs);
	}

}
