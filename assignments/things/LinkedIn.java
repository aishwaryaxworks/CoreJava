package com.xworkz.assignments.things;

import java.util.Arrays;

public class LinkedIn {
	public String fullName;
	public String headline;
	public String[] skills;
	public String currentCompany;
	public String[] education;
	public int connectionsCount;
	public String[] certifications;
	public String summary;
	public String[] previousCompanies;
	public String email;
	public int posts;
	public boolean openToWork;
	public int endorsements;
	public int jobsApplied;
	public int numOfViews;

    // No-argument constructor
    public LinkedIn() {
    	System.out.println("No argument constructor.");
    }

    // All-argument constructor
    public LinkedIn(String fullName, String headline, String[] skills, String currentCompany, String[] education,
                    int connectionsCount, String[] certifications, String summary, String[] previousCompanies,
                    String email,int posts,boolean openToWork,int endorsements,int jobsApplied,int numOfViews) {
        this.fullName = fullName;
        this.headline = headline;
        this.skills = skills;
        this.currentCompany = currentCompany;
        this.education = education;
        this.connectionsCount = connectionsCount;
        this.certifications = certifications;
        this.summary = summary;
        this.previousCompanies = previousCompanies;
        this.email = email;
        this.posts = posts;
        this.openToWork = openToWork;
        this.endorsements = endorsements;
        this.jobsApplied = jobsApplied;
        this.numOfViews = numOfViews;
    }

    // Setter methods
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public void setCurrentCompany(String currentCompany) {
        this.currentCompany = currentCompany;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public void setConnectionsCount(int connectionsCount) {
        this.connectionsCount = connectionsCount;
    }

    public void setCertifications(String[] certifications) {
        this.certifications = certifications;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setPreviousCompanies(String[] previousCompanies) {
        this.previousCompanies = previousCompanies;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPosts(int posts) {
    	this.posts = posts;
    }
    
    public void setOpenToWorks(boolean openToWork) {
    	this.openToWork = openToWork;
    }
    
    public void setEndorsements(int endorsements) {
    	this.endorsements = endorsements;
    }
    
    public void setJobsApplied(int jobsApplied) {
    	this.jobsApplied = jobsApplied;
    }
    
    public void setNumOfViews(int numOfViews) {
    	this.numOfViews = numOfViews;
    }

    // Display method
    public void displayProperties() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Headline: " + headline);
        System.out.println("Skills: " + Arrays.toString(skills));
        System.out.println("Current Company: " + currentCompany);
        System.out.println("Education: " + Arrays.toString(education));
        System.out.println("Connections Count: " + connectionsCount);
        System.out.println("Certifications: " + Arrays.toString(certifications));
        System.out.println("Summary: " + summary);
        System.out.println("Previous Companies: " + Arrays.toString(previousCompanies));
        System.out.println("Email: " + email);
        System.out.println("Posts:" + posts);
        System.out.println("Open to work?:" + openToWork);
        System.out.println("Endorsements:"+ endorsements);
        System.out.println("Jobs applied:" + jobsApplied);
        System.out.println("Number of views:" + numOfViews);
    }

    
}

