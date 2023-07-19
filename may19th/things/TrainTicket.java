package com.xworks.may19th.things;

public class TrainTicket {
	String from;
	String to;
	String date="15-07-2023";
	TrainClasses classes;
	TrainType type;
	
	public TrainTicket() {
		System.out.println("No argument constructor-Train");
	}
	
	public TrainTicket(String from, String to) {
		super();
		this.from=from;
		this.to=to;
	}
		
	public TrainTicket(String from, String to, String date, TrainClasses classes, TrainType type) {
		this("BNG","MYS");
		this.date = date;
		this.classes = classes;
		this.type = type;
	}
	
	public void displayTicket() {
		System.out.println("Ticket details: "+this.from+", "+this.to+", "+this.date+", "+this.classes+", "+this.type);
	}
	
	public void setType(TrainType type) {
		this.type=type;
	}

}
