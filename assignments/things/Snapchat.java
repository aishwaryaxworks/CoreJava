package com.xworkz.assignments.things;

public class Snapchat extends Application{
	public String filterName;
	public String location;
	public int streaks;
	public float videoDuration;
	
	public Snapchat() {
		System.out.println("Snapchat-No argument Constructor.");
	}

	public Snapchat(String filterName, String location, int streaks, float videoDuration) {
		this.filterName = filterName;
		this.location = location;
		this.streaks = streaks;
		this.videoDuration = videoDuration;
		System.out.println("Snapchat-All argument constructor.");
		System.out.println("Filter name:"+this.filterName+", Location:"+this.location+", Num of Streaks"
				+ ":"+this.streaks+", Video Duration:"+this.videoDuration);
	}
	
	public void sendSnap() {
		System.out.println("Send snap method.");
		
	}

}
