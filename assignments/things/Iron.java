package com.xworkz.assignments.things;

public class Iron {
	String brand;
    String model;
    int power;
    boolean isSteamIron;
    double weight;
    int temperatureControl;
	
	public Iron() {
		System.out.println(getClass());
		System.out.println("Iron class constructor.");
	}
	
	public Iron(String brand, String model, int power, boolean isSteamIron, double weight, int temperatureControl) {
		this.brand = brand;
		this.model = model;
		this.power = power;
		this.isSteamIron = isSteamIron;
		this.weight = weight;
		this.temperatureControl = temperatureControl;
	}

	@Override
	public String toString() {
		return "Iron [brand:'"+brand+"', model:'"+model+"', Power:'"+power+"', Is Steam Iron:'"+isSteamIron+"', "
				+ "weight:'"+weight+"', Temperature Control:'"+temperatureControl+"']";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Iron i = (Iron)obj;
		if(this.brand == i.brand && this.model == i.model && this.power == i.power && this.isSteamIron == i.isSteamIron 
				&& this.weight == i.weight && this.temperatureControl == i.temperatureControl)
			return true;
		return false;
	}

}
