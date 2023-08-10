package com.xworkz.association.things;

public class Music {
	private String type;
	private float duration;
	private String lyrics;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	public String getLyrics() {
		return lyrics;
	}
	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}
	
	@Override
	public String toString() {
		return "Music [type=" + type + ", duration=" + duration + ", lyrics=" + lyrics + "]";
	}
	
}
