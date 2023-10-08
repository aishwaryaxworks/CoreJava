package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.app.User;
import com.xworkz.exceptions.exception.EmailException;
import com.xworkz.exceptions.exception.UsernameException;

public class UserRunner {

	public static void main(String[] args) throws EmailException /*UsernameException*/ {
		User user1=new User("Aishwarya","abc@gmail.com");
		System.out.println("User values:"+user1.toString());
		
		if(user1.getEmail().equals("abc@gmail.com")) {
			System.out.println("Email : "+user1.getEmail());
			throw new EmailException("Email is 'abc@gmail.com' ...!");
		}
		
		if(user1.getUserName().equals("Aishwarya")) {
			//System.out.println("Username : "+user1.getUserName());
			//throw new UsernameException("User name is 'Aishwarya' ...!");
		}
		
		System.out.println("This is user defined exception...!");
	}

}
