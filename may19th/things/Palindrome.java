package com.xworks.may19th.things;

public class Palindrome {
	public static void main(String[] args) {
		String string1="palindrome";
		System.out.println(string1);
		String reverseString="";
		char[] string1List = string1.toCharArray();
		for (int i=string1List.length-1; i>=0;i--) {
			reverseString+=string1List[i];
		}
		System.out.println(reverseString);
		
		if(string1.equals(reverseString)) {
			System.out.println("String "+string1+" is palindrome");
		}else {
			System.out.println("String "+string1+" is not palindrome");
		}
	}
}
