package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Seaport;

public class SeaportRunner {

	public static void main(String[] args) {
		Seaport port1 = new Seaport();
		Seaport port2 = new Seaport(10,5, "Port of Shangai", "5.30am",true,"Ocean coast");
		if (port2 != null) {
			port2.displaySeaport();
			System.out.println("'port2' object is not null.");
		}
		
	}

}
