package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Aircooler;

public class AircoolerRunner {

	public static void main(String[] args) {
        Aircooler aircooler = new Aircooler(15.5);
        String weather = aircooler.checkTemperature();
        System.out.println("Weather: " + weather);
        aircooler.turnOffAircooler();
    }

}
