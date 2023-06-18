package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.ComicBook;

public class ComicBookRunner {

	public static void main(String[] args) {
		ComicBook book0 = new ComicBook();
		ComicBook book1 = new ComicBook("Popeye The SailorMan / Kimi ni Todoke");
		ComicBook book2 = new ComicBook("Popeye The SailorMan / Kimi ni Todoke", 128);
		ComicBook book3 = new ComicBook("Popeye The SailorMan / Kimi ni Todoke", 128, "King Features Syndicate");
		
		String authors[] = {"E. C. Segar","Doc Winner","Tom Sims"};
		String artists[] = {"Alex Hallatt", "Erica Henderson", "Tom Neely"};
		int issueNumber[] = {5, 15, 18};
		
		ComicBook book4 = new ComicBook(authors);
		ComicBook book5 = new ComicBook(authors, artists);
		ComicBook book6 = new ComicBook(authors, artists, issueNumber);
		
		ComicBook book7 = new ComicBook("Popeye The SailorMan / Kimi ni Todoke", authors);
		ComicBook book8 = new ComicBook("Popeye The SailorMan / Kimi ni Todoke", 128, "King Features Syndicate", 
				authors);
		ComicBook book9 = new ComicBook("Popeye The SailorMan / Kimi ni Todoke",authors,artists,issueNumber, 
				128, "King Features Syndicate");
	}

}
