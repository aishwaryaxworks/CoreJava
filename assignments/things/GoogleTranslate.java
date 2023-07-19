package com.xworkz.assignments.things;

public class GoogleTranslate extends Google{
	String pageLanguage="Greek";
	
	@Override
	public void pageLanguage() {
		System.out.println("Actual page Laguage is:"+super.pageLanguage);
		System.out.println("Change Page Language to:"+pageLanguage);
	}
	
}
