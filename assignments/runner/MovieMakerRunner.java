package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.MovieMaker;

public class MovieMakerRunner {

	public static void main(String[] args) {
		MovieMaker mm1 = new MovieMaker();
		String val1 = mm1.toString();
		System.out.println(val1);	

		String[] cast1 = { "Leonardo DiCaprio", "Kate Winslet", "Billy Zane", "Kathy Bates", "Frances Fisher" };
		MovieMaker mm2 = new MovieMaker("James Cameron", "Jon Landau", "Titanic", 1997, 2000000.00, "Drama/Romance",
				195, true, cast1, true);
		String val2 = mm2.toString();
		System.out.println(val2);

		boolean eq1 = mm1.equals(mm2);
		System.out.println("Are the values equal?:"+eq1);

		String[] cast2 = { "Keanu Reeves", "Carrie-Anne Moss", "Hugo Weaving", "Laurence Fishburne", "Joe Pantoliano" };
		MovieMaker mm3 = new MovieMaker("Lana Wachowski", "Lilly Wachowski", "The Matrix", 1999, 630000.00, "Action/Sci-Fi",
				136, true, cast2, true);
		String val3 = mm3.toString();
		System.out.println(val3);
		boolean eq2 = mm2.equals(mm3);
		System.out.println("Are the values equal?:"+eq2);

		String[] cast3 = { "Keanu Reeves", "Carrie-Anne Moss", "Hugo Weaving", "Laurence Fishburne", "Joe Pantoliano" };
		MovieMaker mm4 = new MovieMaker("Lana Wachowski", "Lilly Wachowski", "The Matrix", 1999, 630000.00, "Action/Sci-Fi",
				136, true, cast3, true);
		String val4 = mm4.toString();
		System.out.println(val4);
		boolean eq3 = mm3.equals(mm4);
		System.out.println("Are the values equal?:"+eq3);
	}

}
