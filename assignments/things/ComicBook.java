package com.xworkz.assignments.things;

public class ComicBook {
	public String title;
	public String[] authors;
	public String[] artists;
	public int[] issueNumber;
	public int pageCount;
	public String publisher;
	
	public void displayBook1(String[] authors) {
		this.authors = authors;
		for (int i=0; i<=authors.length-1; i++) {
			System.out.println("Authors:"+this.authors[i]);
		} 
	}

	public void displayBook2(String[] authors, String[] artists) {
		this.authors = authors;
		this.artists = artists;
		for (int i=0; i<=authors.length-1; i++) {
			System.out.println("Authors:"+this.authors[i]);
			System.out.println("Artists:"+this.artists[i]);
		} 
	}

	public void displayBook3(String[] authors, String[] artists, int[] issueNumber) {
		this.authors = authors;
		this.artists = artists;
		this.issueNumber = issueNumber;
		for (int i=0; i<=authors.length-1; i++) {
			System.out.println("Authors:"+this.authors[i]);
			System.out.println("Artists:"+this.artists[i]);
			System.out.println("Issue Numbers:"+this.issueNumber[i]);
		} 
	}
	
	public void displayBook4(String title, String authors[]) {
		this.title = title;
		this.authors = authors;
		for (int i=0; i<=authors.length-1; i++) {
			System.out.println("Title:"+this.title+", Authors:"+this.authors);
		} 
	}
	
	public void displayBook5(String title, int pageCount, String publisher, String artists[]) {
		this.title = title;
		this.pageCount = pageCount;
		this.publisher = publisher;
		this.artists = artists;
		for (int i=0; i<=artists.length-1; i++) {
			System.out.println("Title:"+this.title+", Page Count:"+this.pageCount+", "
					+ "Publisher:"+this.publisher+", Artists:"+this.artists);
		} 
	}

	//No argument constructor
	public ComicBook() {
		System.out.println("This no argument constructor.");
		System.out.println("---------------------");
	}

	//all argument constructor
	public ComicBook(String title, String[] authors, String[] artists, int[] issueNumber, int pageCount, 
			String publisher) {
		System.out.println("This is all argument constructor.");
		System.out.println("---------------------");
	}

	//one argument constructor
	public ComicBook(String title) {
		this.title = title;
		System.out.println("This constructor accepts one argument.");
		System.out.println("Title:"+this.title);
		System.out.println("---------------------");
	}

	//two argument constructor 
	public ComicBook(String title, int pageCount) {
		this.title = title;
		this.pageCount = pageCount;
		System.out.println("This constructor accepts two arguments.");
		System.out.println("Title:"+this.title+", Page Count:"+this.pageCount);
		System.out.println("---------------------");
	}

	//three argument constructor 
	public ComicBook(String title, int pageCount, String publisher) {
		this.title = title;
		this.pageCount = pageCount;
		this.publisher = publisher;
		System.out.println("This constructor accepts three arguments.");
		System.out.println("Title:"+this.title+", Page Count:"+this.pageCount+", Publisher:"+this.publisher);
		System.out.println("---------------------");
	}

	//one argument constructor - array
	public ComicBook(String[] authors) {
		this.authors = authors;
		System.out.println("This constructor accepts one array.");
		displayBook1(authors);
		System.out.println("---------------------");
	}

	//two argument constructor - array
	public ComicBook(String[] authors, String artists[]) {
		this.authors = authors;
		this.artists = artists;
		System.out.println("This constructor accepts two arrays.");
		displayBook2(authors, artists);
		System.out.println("---------------------");
	}

	//three argument constructor - array
	public ComicBook(String[] authors, String artists[], int[] issueNumber) {
		this.authors = authors;
		this.artists = artists;
		this.issueNumber = issueNumber;
		System.out.println("This constructor accepts three arrays.");
		displayBook3(authors, artists, issueNumber);
		System.out.println("---------------------");
	}
	
	//one argument - one array
	public ComicBook(String title, String authors[]) {
		this.title = title;
		this.authors = authors;

		System.out.println("This constructor accepts one arguement and one array.");
		displayBook4(title, authors);		
		System.out.println("---------------------");
	}
	
	//three argument - one array
	public ComicBook(String title, int pageCount, String publisher, String authors[]) {
		this.title = title;
		this.pageCount = pageCount;
		this.publisher = publisher;
		this.authors = authors;

		System.out.println("This constructor accepts three arguement and one array.");
		displayBook5(title, pageCount, publisher, authors);		
		System.out.println("---------------------");
	}
}
