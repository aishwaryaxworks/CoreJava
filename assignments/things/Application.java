package com.xworkz.assignments.things;

public class Application {
	// Properties
	public String name;
	public String version;
	public int size;
	public String developer;
	public String category;
	public int downloads;
	public boolean requiresInternet;
	public boolean isPaid;
	public String description;
	public String security;

	public Application() {
		System.out.println("Application-No argument constructor.");
		
	}

	public Application(String name, String version, int size, String developer, String category, int downloads,
			boolean requiresInternet, boolean isPaid, String description, String security) {
		this.name = name;
		this.version = version;
		this.size = size;
		this.developer = developer;
		this.category = category;
		this.downloads = downloads;
		this.requiresInternet = requiresInternet;
		this.isPaid = isPaid;
		this.description = description;
		this.security = security;
		System.out.println("Application-All argument constructor.");
		System.out.println("Name:"+this.name+", Version:"+this.version+", Size:"+this.size+", Developer:"
				+ ""+this.developer+", Category:"+this.category+", Downloads:"+this.downloads+", Requires internet"
						+ "?:"+this.requiresInternet+", Is paid?:"+this.isPaid+", Description:"+this.description+", "
								+ "Security:"+this.security);
	}

	// Methods
	public void install() {
		System.out.println("Application Installing method.");
	}

	public void launch() {
		System.out.println("Application Launching method.");
	}

	public void uninstall() {
		System.out.println("Application Uninstalling method.");
		
	}

}
