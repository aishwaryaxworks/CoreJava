package com.xworkz.assignments.things;

public class GoogleMaps extends Google{
	public String searchLocation;
	public String enterDestination;
	public String directions;
	public boolean publicTransportAvailable;
	public int numOfroutePossibilities;
	
	@Override
	public void display() {
		System.out.println("Display website.");
	}
	
	@Override
	public void search() {
		System.out.println("Search Website.");
	}
	
	@Override
	public void find() {
		System.out.println("Find the right webpage.");
	}
	
	@Override
	public void visit() {
		System.out.println("Visit:"+enterDestination);
	}
	
	@Override
	public void googleOwner() {
		System.out.println("Owner of google is:"+founder);
	}
	
	@Override
	public void printTitle() {
		System.out.println("Title of page:"+searchTitle);
	}
	
	@Override
	public void averageTimeOnPage() {
		System.out.println("Time spent on page:"+timeSpentOnPageInSeconds);
	}
	
	@Override
	public void pageLanguage() {
		System.out.println("Page Language is:"+pageLanguage);
	}
	
	@Override
	public void country() {
		System.out.println("URL country:"+searchCountry);
	}
	
	@Override
	public void maps() {
		System.out.println("Display maps.");
	}
	
	@Override
	public void displayUserName() {
		System.out.println("User name:"+userName);
	}
	
	@Override
	public void displayIfSecureWebsite() {
		System.out.println("Is website secure?:"+isSecure);
	}
	
	@Override
	public void location() {
		System.out.println("Headquartes Location:"+headquartersLocation);
	}
	
	@Override
	public void advertisement() {
		System.out.println("Is this page an ad?: "+isAd);
	}
	
	@Override
	public void openInBrowser() {
		System.out.println("Open this page in brwoser");
	}
	
	@Override
	public void translate() {
		System.out.println("Translate page to:"+pageLanguage);
	}
	
	@Override
	public void displayCompanyDetails() {
		System.out.println("Company name:"+companyName+", CEO:"+ceo+", Year founded:"+yearFounded);
	}
	
	@Override
	public void numOfProductsLaunced() {
		System.out.println("Number of products Launched:"+numberOfProducts);
	}
	
	@Override
	public void safeSearch() {
		System.out.println("Is safe search enabled?:"+safeSearchEnabled);
	}
	
	@Override
	public void updates() {
		System.out.println("Page is last updated on:"+pageLastModified);
	}

}
