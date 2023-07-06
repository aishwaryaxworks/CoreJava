package com.xworkz.inheritance.things;

public class Telegram extends Application{
	public String chatName;
	public String urlShared;
	public boolean canCall;
	public int picsShared;
	
	public Telegram() {
		System.out.println("Telegram-No argument constructor.");
	}

	public Telegram(String chatName, String urlShared, boolean canCall, int picsShared) {
		this.chatName = chatName;
		this.urlShared = urlShared;
		this.canCall = canCall;
		this.picsShared = picsShared;
		
		System.out.println("Telegram-All argument constructor");
		System.out.println("Chat with:"+this.chatName+", Movie URL:"+this.urlShared+", Can call?:"+this.canCall+", "
				+ "Num of Pics shared:"+this.picsShared);
	}
	
	public void chat() {
		System.out.println("Telegram Chat method.");
	}
	
}
