package com.xworkz.assignments.things;

public class Steel {
	String material;
	int items;
	String materialFrom;
	String usedFor;
	
	public Steel() {
		System.out.println(getClass());
		System.out.println("Steel class constructor.");
	}
	
	public Steel(String material, int items) {
		this.material = material;
		this.items = items;
	}

	@Override
	public String toString() {
		return "Steel [Material:'"+material+"', Number of Items:'"+items+"']";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Steel s = (Steel)obj;
		if(this.material == s.material && this.items == s.items)
			return true;
		return false;
	}

}
