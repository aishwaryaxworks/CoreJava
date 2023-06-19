package com.xworkz.assignments.things;

public class Hirect {
	public String companyName;
	public String industry;
	public int employeesCount;
	public String headquartersLocation;
	public boolean isPublicCompany;

    // No-argument constructor
    public Hirect() {
    }

    // All-argument constructor
    public Hirect(String companyName, String industry, int employeesCount, String headquartersLocation,
                  boolean isPublicCompany) {
        this.companyName = companyName;
        this.industry = industry;
        this.employeesCount = employeesCount;
        this.headquartersLocation = headquartersLocation;
        this.isPublicCompany = isPublicCompany;
    }

    // Display method
    public void displayProperties() {
        System.out.println("Company Name: " +companyName);
        System.out.println("Industry: " +industry);
        System.out.println("Employees Count: " +employeesCount);
        System.out.println("Headquarters Location: " +headquartersLocation);
        System.out.println("Is Public Company: " +isPublicCompany);
    }

    
}

