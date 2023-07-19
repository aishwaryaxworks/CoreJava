package com.xworkz.assignments.things;

public class Google {
	public static String headquartersLocation = "Mountain View, CA";
	public static int totalEmployees = 139995;
	public static String website = "www.google.com";
	public static String companyColor = "Blue";
	public static boolean isPublicCompany = true;

	public final String companyName="Google Inc.";
	public final int yearFounded=1998;
	public final String ceo="Sundar Pichai";
	public final String founder="Larry Page, Sergey Brin";
	public final int numberOfProducts=271;

	// Properties related to search results
	public String searchTitle;
	public String snippet;
	public String url;
	public int numOfVisits;
	public int searchRank;
	public boolean isAd;

	// Properties related to page information
	public String pageLanguage;
	public String pageLastModified;
	public int pageSize;
	public String relatedKeywords;

	// Properties related to website
	public String websiteName;
	public String websiteDescription;
	public String websiteLanguage;
	public int websiteRank;
	public boolean isSecure;

	// Properties related to user interaction
	public int clicksCount;
	public int likes;
	public int userReview;
	public double comments;
	public int timeSpentOnPageInSeconds;

	// Properties related to user demographics
	public String userName;
	public String userLocation;
	public String userDeviceType;
	public String userBrowser;

	// Properties related to search context
	public String searchQuery;
	public String searchTime;
	public String searchLocation;
	public String searchCountry;
	public String searchDeviceType;

	// Properties related to search settings
	public boolean safeSearchEnabled;
	public boolean personalizedSearchEnabled;
	public boolean locationBasedSearchEnabled;
	public boolean autoCompleteEnabled;
	public boolean spellCheckEnabled;

	// Properties related to advertisement
	public boolean isPromoted;
	public String adName;
	public double adClickCost;
	public int adPosition;
	
	public Google() {
		//no argument constructor
	}
	
	// Initializing using constructor
	public Google(String searchTitle, String snippet, String url, int numOfVisits, int searchRank, boolean isAd,
			String pageLanguage, String pageLastModified, int pageSize, String relatedKeywords, String websiteName,
			String websiteDescription, String websiteLanguage, int websiteRank, boolean isSecure, int clicksCount,
			int likes, int userReview, double comments, int timeSpentOnPageInSeconds, String userName, String userLocation,
			String userDeviceType, String userBrowser, String searchQuery, String searchTime, String searchLocation,
			String searchCountry, String searchDeviceType, boolean safeSearchEnabled, boolean personalizedSearchEnabled,
			boolean locationBasedSearchEnabled, boolean autoCompleteEnabled, boolean spellCheckEnabled,
			boolean isPromoted, String adName, double adClickCost, int adPosition) {
		
		this.searchTitle = searchTitle;
		this.snippet = snippet;
		this.url = url;
		this.numOfVisits = numOfVisits;
		this.searchRank = searchRank;
		this.isAd = isAd;
		this.pageLanguage = pageLanguage;
		this.pageLastModified = pageLastModified;
		this.pageSize = pageSize;
		this.relatedKeywords = relatedKeywords;
		this.websiteName = websiteName;
		this.websiteDescription = websiteDescription;
		this.websiteLanguage = websiteLanguage;
		this.websiteRank = websiteRank;
		this.isSecure = isSecure;
		this.clicksCount = clicksCount;
		this.likes = likes;
		this.userReview = userReview;
		this.comments = comments;
		this.timeSpentOnPageInSeconds = timeSpentOnPageInSeconds;
		this.userName = userName;
		this.userLocation = userLocation;
		this.userDeviceType = userDeviceType;
		this.userBrowser = userBrowser;
		this.searchQuery = searchQuery;
		this.searchTime = searchTime;
		this.searchLocation = searchLocation;
		this.searchCountry = searchCountry;
		this.searchDeviceType = searchDeviceType;
		this.safeSearchEnabled = safeSearchEnabled;
		this.personalizedSearchEnabled = personalizedSearchEnabled;
		this.locationBasedSearchEnabled = locationBasedSearchEnabled;
		this.autoCompleteEnabled = autoCompleteEnabled;
		this.spellCheckEnabled = spellCheckEnabled;
		this.isPromoted = isPromoted;
		this.adName = adName;
		this.adClickCost = adClickCost;
		this.adPosition = adPosition;
	}
	
	public void display() {
		System.out.println("Display website.");
	}
	
	public void search() {
		System.out.println("Search Website.");
	}
	
	public void find() {
		System.out.println("Find the right webpage.");
	}
	
	public void visit() {
		System.out.println("Number of visits for this page is:"+this.numOfVisits);
	}
	
	public void googleOwner() {
		System.out.println("Owner of google is:"+this.founder);
	}
	
	public void printTitle() {
		System.out.println("Title of page:"+this.searchTitle);
	}
	
	public void averageTimeOnPage() {
		System.out.println("Time spent on page:"+this.timeSpentOnPageInSeconds);
	}
	
	public void pageLanguage() {
		System.out.println("Page Language is:"+this.pageLanguage);
	}
	
	public void country() {
		System.out.println("URL country:"+this.searchCountry);
	}
	
	public void maps() {
		System.out.println("Display maps.");
	}
	
	public void displayUserName() {
		System.out.println("User name:"+this.userName);
	}
	
	public void displayIfSecureWebsite() {
		System.out.println("Is website secure?:"+this.isSecure);
	}
	
	public void location() {
		System.out.println("Headquartes Location:"+this.headquartersLocation);
	}
	
	public void advertisement() {
		System.out.println("Is this page an ad?: "+this.isAd);
	}
	
	public void openInBrowser() {
		System.out.println("Open this page in brwoser");
	}
	
	public void translate() {
		System.out.println("Translate page to:"+this.pageLanguage);
	}
	
	public void displayCompanyDetails() {
		System.out.println("Company name:"+this.companyName+", CEO:"+this.ceo+", Year founded:"+this.yearFounded);
	}
	
	public void numOfProductsLaunced() {
		System.out.println("Number of products Launched:"+this.numberOfProducts);
	}
	
	public void safeSearch() {
		System.out.println("Is safe search enabled?:"+this.safeSearchEnabled);
	}
	
	public void updates() {
		System.out.println("Page is last updated on:"+this.pageLastModified);
	}
}
