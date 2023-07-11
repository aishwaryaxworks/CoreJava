package com.xworkz.inheritance.things;

public class GoogleTalkback extends ArtificialIntelligence {
	protected String version;
    protected boolean isEnabled;
    protected int speechRate;
    protected String[] supportedLanguages;

	public GoogleTalkback() {
		System.out.println("Google Talkback-no argument constructor.");
	}
}
