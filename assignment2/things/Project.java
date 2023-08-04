package com.xworkz.assignment2.things;

import java.util.Date;

public class Project {
    private int projectId;
    private double budget;
    private boolean isActive;
    private char projectType;
    private String projectName;
    private String projectManager;
    private Integer teamMembers;
    private String projectDetails;
    private Date startDate=new Date();

    // Getters and Setters for all properties
    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public char getProjectType() {
        return projectType;
    }

    public void setProjectType(char projectType) {
        this.projectType = projectType;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", budget=" + budget + ", isActive=" + isActive + ", projectType="
				+ projectType + ", projectName=" + projectName + ", projectManager=" + projectManager + ", teamMembers="
				+ teamMembers + ", projectDetails=" + projectDetails + ", startDate=" + startDate + "]";
	}
    
    @Override
    public boolean equals(Object obj) {
    	if (obj == null)
			return false;
    	if(getClass() != obj.getClass()) 
    		return false;
    	Project p = (Project)obj;
    	if(this.projectId==p.projectId && this.budget==p.budget && this.isActive==p.isActive && this.projectType==p.projectType &&
    			this.projectManager==p.projectManager && this.teamMembers==p.teamMembers && this.projectDetails==p.projectDetails &&
    			this.startDate==p.startDate)
    		return true;
    	return false;
    }
}

