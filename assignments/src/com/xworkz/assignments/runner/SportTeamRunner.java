package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.SportTeam;

public class SportTeamRunner {

	public static void main(String[] args) {
		SportTeam team0 = new SportTeam();
		SportTeam team1 = new SportTeam("Lion's club");
		SportTeam team2 = new SportTeam("Lion's club", "Cricket");
		SportTeam team3 = new SportTeam("Lion's club", "Cricket", 3);
		
		String players[] = {"Virat Kohli","Rohit Sharma","Jasprit Bumrah"};
		int prizeMoney[] = {10000, 20000, 30000};
		int playerAge[] = {30, 45, 35};
		
		SportTeam team4 = new SportTeam(prizeMoney);
		SportTeam team5 = new SportTeam(prizeMoney, players);
		SportTeam team6 = new SportTeam(prizeMoney, players, playerAge);
		
		SportTeam team7 = new SportTeam("Lion's club", players);
		SportTeam team8 = new SportTeam("Lion's club", "Cricket", 3, players);
		SportTeam team9 = new SportTeam("Lion's club", "Cricket", 3, prizeMoney, players, playerAge);
	}

}
