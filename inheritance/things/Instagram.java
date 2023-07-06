package com.xworkz.inheritance.things;

public class Instagram extends Application{
	public String url;
	public boolean calls;
	public boolean fingerprint;
	public String caption;
	
	public Instagram() {
		System.out.println("Instagram - No argument constructor.");
	}

	public Instagram(String url, boolean calls, boolean fingerprint, String caption) {
		this.url = url;
		this.calls = calls;
		this.fingerprint = fingerprint;
		this.caption = caption;
		System.out.println("Instagram-All argument constructor.");
		System.out.println("URL:"+this.url+", Calls allowed:"+this.calls+", Is fingerprint protected:"
				+ ""+this.fingerprint);
	}
	
	public void displayInstagram() {
		System.out.println("Caption:"+this.caption);
	}
}
