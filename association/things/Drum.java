package com.xworkz.association.things;

import com.xworkz.association.interfaces.MusicalInstruments;

public class Drum implements MusicalInstruments{
	private String brand;
	private double price;
	private Music music;
	
	public Drum(String brand, double price, Music music) {
		this.brand = brand;
		this.price = price;
		this.music = music;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Music getMusic() {
		return music;
	}
	public void setMusic(Music music) {
		this.music = music;
	}
	
	@Override
	public String play(boolean active) {
		return "instrument status:"+active;
	}
	
	@Override
	public String sound(String name) {
		return "This is sound of:"+name;
	}
	
	@Override
	public String toString() {
		return "Drum [brand=" + brand + ", price=" + price + ", music=" + music + "]";
	}
}
