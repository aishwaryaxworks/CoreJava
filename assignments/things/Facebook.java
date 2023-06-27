package com.xworkz.assignments.things;

public class Facebook {
	public String firstName;
	public String lastName;
	public char gender;
	public String dob;
	public String phonenum;
	public String email;
	public String password;
	
	public Facebook() {
		System.out.println("No argument constructor.");
	}
	
	public Facebook(String firstName, String lastName, char gender, String dob, String phonenum, String email, 
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.phonenum = phonenum;
		this.email = email;
		this.password = password;
		System.out.println("All argument constructor.");
		
	}
	
	public void register(String firstName, String email, String password) {
		this.firstName=firstName;
		this.email=email;
		this.password=password;
		System.out.println("Name:"+this.firstName+", Email:"+this.email+", Password:"+this.password);
		System.out.println("-----------------------------------------------------------");
	}
	
	public void register(String firstName, String lastName, char gender, String dob, String phonenum, String email, 
			String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.phonenum = phonenum;
		this.email = email;
		this.password = password;
		
		System.out.println("First name:"+this.firstName+", Last name:"+lastName+", Gender:"+this.gender+", Date "
				+ "of Birth:"+this.dob);
		System.out.println("Phone number:"+this.phonenum+", Email:"+this.email+", Password:"+this.password);
		System.out.println("-----------------------------------------------------------");
	}
	
	public void validate(String firstName, String lastName, String email, String password) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
		this.password=password;
		
		if(this.firstName == null || this.lastName == null || this.email == null || this.password == null) {
			System.out.println("Some fields are no filled!");
		}
		else {
			System.out.println("No fields null.");
		}
		System.out.println("-----------------------------------------------------------");
		
	}
	
	public String login(String userName, String password) {
		this.firstName=userName;
		this.password=password;
		System.out.println("User name:"+this.firstName+", Password:"+this.password);
		System.out.println("-----------------------------------------------------------");
		return userName;
	}

}
