package com.xworkz.constructor.things;

public class Ludo {
	public int players;
	public String color;
	public String mode;
	
	public Ludo() {
		System.out.println("No argument constructor.");
	}
	
	public Ludo(int players, String color, String mode) {
		System.out.println("All argument constructor.");
		
		this.players = players;
		this.color = color;
		this.mode = mode;
	}
	
	public void diceRoll() {
		System.out.println("Non Static method - roll method.");
		System.out.println("Roll the Dice!");
	}
	
	public void move() {
		System.out.println("Non Static method - move method.");
		System.out.println("Move pawn!");
	}
	
	public static void playing() {
		System.out.println("Static method - play method.");
		System.out.println("Roll dice and start playing!");
	}

}
