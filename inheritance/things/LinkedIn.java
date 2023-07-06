package com.xworkz.inheritance.things;

public class LinkedIn extends Application{
	public String name;
	public String description;
	public int connections;
	public float reactions;
	
	public LinkedIn() {
		System.out.println("LinkedIn-No argument constructor.");
	}

	public LinkedIn(String name, String description, int connections, float reactions) {
		this.name = name;
		this.description = description;
		this.connections = connections;
		this.reactions = reactions;
		System.out.println("LinedIn-All argument constructor.");
		System.out.println("Person name:"+this.name+", Person Description:"+this.description+", Num of Connections:"
				+ ""+this.connections+", Num of reactions:"+this.reactions);
	}
	
	public void apply() {
		System.out.println("LinkedIn-Apply for job method.");
	}
	
	
}
