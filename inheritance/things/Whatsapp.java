package com.xworkz.inheritance.things;

public class Whatsapp extends Application{
	public String personName;
	long phoneNum;
	int numOfContacts;
	int numOfGroups;
	public int numOfChats;
	public boolean isEncrypted;
	public boolean attachPhoto;
	
	public Whatsapp() {
		System.out.println("Whatsapp-No arguement constructor. Version 1 !");
	}

	public Whatsapp(String personName, int numOfChats, boolean isEncrypted, boolean attachPhoto) {
		this.personName = personName;
		this.numOfChats = numOfChats;
		this.isEncrypted = isEncrypted;
		this.attachPhoto = attachPhoto;
		System.out.println("Whatsapp-All argument constructor.");
		System.out.println("Chat with:"+this.personName+", Number of chats:"+this.numOfChats+", Is Encrypted?:"
				+ ""+this.isEncrypted+", Attach photo:"+this.attachPhoto);
		
	}
	
	public void openChat() {
		System.out.println("Open"+this.personName+"'s chat on whatsapp.");
		
	}
	
}
