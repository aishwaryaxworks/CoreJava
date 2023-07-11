package com.xworkz.inheritance.things;

public class ChatGPT extends ArtificialIntelligence{
	protected String modelVersion;
    protected int contextSize;
    protected boolean isOnline;
    protected String[] supportedLanguages;
    
    public ChatGPT() {
		System.out.println("ChatGPT-no argument constructor");
	}

}
