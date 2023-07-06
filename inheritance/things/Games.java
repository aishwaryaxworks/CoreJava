package com.xworkz.inheritance.things;

public class Games {
	public String game_name;
	public String type;
	public int players;
	
	public Games() {
		System.out.println("Games-No argument constructor.");
	}
	
	public Games(String game_name, String type, int players) {
		this.game_name = game_name;
		this.type = type;
		this.players = players;
		
		System.out.println("Games-All argument constructor.");
	}
	
	public void display() {
		System.out.println("Game name:"+this.game_name+", Type:"+this.type+", Players:"+this.players);
	}
}
