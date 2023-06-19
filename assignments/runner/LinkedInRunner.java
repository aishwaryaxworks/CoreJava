package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.LinkedIn;

public class LinkedInRunner {

	public static void main(String[] args) {
		// Create an instance of the LinkedIn class
		LinkedIn user = new LinkedIn();

		// Set the values using setter methods
		user.setFullName("Aishwarya Naik");
		user.setHeadline("Software Engineer");
		user.setCurrentCompany("ABC Corporation");
		user.setConnectionsCount(500);
		user.setEmail("aishwaryaxworks@gmail.com");
		user.setSummary("Experienced software engineer with a passion for creating innovative solutions.");
		user.setPosts(10);
		user.setEndorsements(5);
		user.setJobsApplied(25);
		user.setNumOfViews(15);
		user.setOpenToWorks(true);

		user.setSkills(new String[]{"Java", "Python", "SQL"});

		user.setEducation(new String[]{"Bachelor's in Computer Science", "Master's in Software Engineering"});

		user.setCertifications(new String[]{"Oracle Certified Java Programmer", "AWS Certified Developer"});

		user.setPreviousCompanies(new String[]{"XYZ Inc.", "123 Corporation"});

		// Display the properties
		user.displayProperties();
	}
}
