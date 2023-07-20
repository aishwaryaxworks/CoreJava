package com.xworkz.inheritance.things;

public class Talent{
	//	String skill="MultiTasking";
	String skill;
	//	int experience=2;
	int experience;

	public Talent() {
		System.out.println(getClass());
		System.out.println("This is a talent constructor...");
	}

	public Talent(String skill, int experience) {
		this.skill = skill;
		this.experience = experience;
	}

	@Override 
	public String toString() { 
		return "Talent [skill='"+skill+"', Talent experience='"+experience+"'] "; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		
		if(getClass()!=obj.getClass()) {
			return false;
		}
		
		Talent t = (Talent)obj; //Whatever the type of object is passed by user, it is converted to Talent class type object
		if (this.skill==t.skill && this.experience == t.experience) {
			return true;
		}
		
		return false;
	}
}
