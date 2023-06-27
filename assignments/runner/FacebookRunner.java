package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Facebook;

public class FacebookRunner {

	public static void main(String[] args) {
		Facebook fb = new Facebook();
		fb.register("Aishwarya", "aishwaryaxworks@gmail.com", "abc123");
		fb.register("Aishwarya", "Naik", 'F', "04-06-1997", "9876543210", "aishwaryaxworks@gmail.com", 
				"abc123xyz");
		fb.login("Aishwarya", "123456");
		fb.validate("Aishwarya", "Naik", "abc@gmail.com", null);
		fb.validate("Aishwarya", "Naik", "xyz@gmail.com", "abc123");
		

	}

}
