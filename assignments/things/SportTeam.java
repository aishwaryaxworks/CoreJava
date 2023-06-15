package com.xworkz.assignments.things;

public class SportTeam {
	public String name;
	public String sport;
	public int numOfTitles;
	public int prizeMoney[];
	public String players[];
	public int playerAge[];

	public void displayTeam1(int[] prizeMoney) {
		this.prizeMoney = prizeMoney;
		for (int i=0; i<=prizeMoney.length-1; i++) {
			System.out.println("Prize Money for every position:"+this.prizeMoney[i]);
		} 
	}

	public void displayTeam2(int[] prizeMoney, String players[]) {
		this.prizeMoney = prizeMoney;
		this.players = players;
		for (int i=0; i<=prizeMoney.length-1; i++) {
			System.out.println("Prize Money for every position:"+this.prizeMoney[i]);
			System.out.println("Team Members:"+this.players[i]);
		} 
	}

	public void displayTeam3(int[] prizeMoney, String players[], int playerAge[]) {
		this.prizeMoney = prizeMoney;
		this.players = players;
		this.playerAge = playerAge;
		for (int i=0; i<=players.length-1; i++) {
			System.out.println("Prize Money for every position:"+this.prizeMoney[i]);
			System.out.println("Team Members:"+this.players[i]);
			System.out.println("Age of players:"+this.playerAge[i]);
		} 
	}
	
	public void displayTeam4(String name, String players[]) {
		this.name = name;
		this.players = players;
		for (int i=0; i<=players.length-1; i++) {
			System.out.println("Team name:"+this.name+", Players are:"+this.players);
		} 
	}
	
	public void displayTeam5(String name, String sport, int numOfTitles, String players[]) {
		this.name = name;
		this.sport = sport;
		this.numOfTitles = numOfTitles;
		this.players = players;
		for (int i=0; i<=players.length-1; i++) {
			System.out.println("Team name:"+this.name+", Sport name:"+this.sport+", Num of "
					+ "Titles:"+this.numOfTitles+", Players are:"+this.players);
		} 
	}

	//No argument constructor
	public SportTeam() {
		System.out.println("This no argument constructor.");
		System.out.println("---------------------");
	}

	//all argument constructor
	public SportTeam(String name, String sport, int numOfTitle, int prizeMoney[], String players[], 
			int playerAge[]) {
		System.out.println("This is all argument constructor.");
		System.out.println("---------------------");
	}

	//one argument constructor
	public SportTeam(String name) {
		this.name = name;
		System.out.println("This constructor accepts one argument.");
		System.out.println("Team name:"+this.name);
		System.out.println("---------------------");
	}

	//two argument constructor 
	public SportTeam(String name, String sport) {
		this.name = name;
		this.sport = sport;
		System.out.println("This constructor accepts two arguments.");
		System.out.println("Team name:"+this.name+", Sport name:"+this.sport);
		System.out.println("---------------------");
	}

	//three argument constructor 
	public SportTeam(String name, String sport, int numOfTitles) {
		this.name = name;
		this.sport = sport;
		this.numOfTitles = numOfTitles;
		System.out.println("This constructor accepts three arguments.");
		System.out.println("Team name:"+this.name+", Sport name:"+this.sport+", Number of "
				+ "Titles:"+this.numOfTitles);
		System.out.println("---------------------");
	}

	//one argument constructor - array
	public SportTeam(int prizeMoney[]) {
		this.prizeMoney = prizeMoney;
		System.out.println("This constructor accepts one array.");
		displayTeam1(prizeMoney);
		System.out.println("---------------------");
	}

	//two argument constructor - array
	public SportTeam(int[] prizeMoney, String players[]) {
		this.prizeMoney = prizeMoney;
		this.players = players;
		System.out.println("This constructor accepts two arrays.");
		displayTeam2(prizeMoney, players);
		System.out.println("---------------------");
	}

	//three argument constructor - array
	public SportTeam(int[] prizeMoney, String players[], int playerAge[]) {
		this.prizeMoney = prizeMoney;
		this.players = players;
		this.playerAge = playerAge;
		System.out.println("This constructor accepts three arrays.");
		displayTeam3(prizeMoney, players, playerAge);
		System.out.println("---------------------");
	}
	
	//one argument - one array
	public SportTeam(String name, String players[]) {
		this.name = name;
		this.players = players;

		System.out.println("This constructor accepts one arguement and one array.");
		displayTeam4(name, players);		
		System.out.println("---------------------");
	}
	
	//three argument - one array
	public SportTeam(String name, String sport, int numOfTitles, String players[]) {
		this.name = name;
		this.sport = sport;
		this.numOfTitles = numOfTitles;
		this.players = players;

		System.out.println("This constructor accepts three arguement and one array.");
		displayTeam5(name, sport, numOfTitles, players);		
		System.out.println("---------------------");
	}

}
