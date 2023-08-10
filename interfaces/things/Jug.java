package com.xworkz.interfaces.things;

import com.xworkz.interfaces.interfaces.WaterFilter;

public class Jug implements WaterFilter{
	
	@Override
	public String filter() {
		return "Water filtering done !";
	}
}
