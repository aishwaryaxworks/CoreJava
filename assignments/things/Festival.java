package com.xworkz.assignments.things;

import java.util.Date;

public class Festival {

	protected String name;
	protected String location;
	protected int year;
	protected boolean isNational;
	protected String theme;
	protected String performerName;
	protected int numberOfStalls;
	protected double ticketPrice;
	protected String startDate;
	protected String endDate;
	protected boolean hasFireworks;
	protected int expectedAttendance;
    protected String organizer;
    protected String mainStage;
    protected long expenditure;
    protected String activity;
    protected String[] foodOptions;
    protected boolean isOutdoor;
    protected boolean hasParade;
    protected String[] guests;

    public Festival() {
		System.out.println("Festival-no argument constructor.");
	}
    
    public void displayFood() {
		System.out.println("Food display before overriding.");
	}
    
}
