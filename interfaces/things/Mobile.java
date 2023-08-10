package com.xworkz.interfaces.things;

import java.io.Serializable;

public class Mobile implements Serializable{
	
	private Charger charger;
	
	public Mobile(Charger charger) {
		this.charger=charger;
	}

}
