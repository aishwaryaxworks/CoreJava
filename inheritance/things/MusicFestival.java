package com.xworkz.inheritance.things;

public class MusicFestival extends Festival {
	protected String name;
    protected String location;
    protected int year;
    protected String[] artists;
    
    public MusicFestival() {
    	super();
		System.out.println("Music festival-no argument constructor.");
	}

}
