package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.app.Password;
import com.xworkz.exceptions.exception.PasswordException;

import java.util.regex.Pattern;
import java.lang.*;

public class PasswordRunner {
	public static void main(String[] args) throws PasswordException{
		Password pw = new Password("Ais@12345");
		System.out.println("Password :"+pw.toString());
		char firstLetter = pw.getPassword().charAt(0);
		char firstUpper = pw.getPassword().toUpperCase().charAt(0);
		boolean res = false;
		String regex1=".*[0-9].*";
		
		if(pw.getPassword().length()<8) {
			//System.out.println("Length is less than 8 characters.");
			throw new PasswordException("Length is less than 8 characters.");
		}
		else if(res ==Character.isUpperCase(pw.getPassword().charAt(0))/*firstLetter != firstUpper*//*Pattern.compile("^[A-Z]").matcher(pw.getPassword()).find()*/){
			throw new PasswordException("Does not start with capital letter... ");
		}
		else if(Pattern.matches(regex1, pw.getPassword())/*Pattern.compile("*[0-9]*").matcher(pw.getPassword()).find()*/) {
			throw new PasswordException("Password does contain digits...");
		}else {
			System.out.println("password not accepted...");
		}
		
	}
}
