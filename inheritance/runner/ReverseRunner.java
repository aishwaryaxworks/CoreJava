package com.xworkz.inheritance.runner;

public class ReverseRunner {
	public static void main(String[] args) {
		String name = "This is sleeping time. It is not good for sleeping .";
		String[] wordList = name.split(" ");
		String reverseWord="";

		for (int i = 0; i<wordList.length; i++) {
			if(wordList[i].equals("sleeping")) {
				char[] reverse = wordList[i].toCharArray();
				for (int j = reverse.length-1; j>=0;j--) {
					//System.out.print(reverse[j]+" ");
					reverseWord+=reverse[j];
					//System.out.println(reverseWord);
				}
				wordList[i]=reverseWord;
			}
			//System.out.println(wordList[i]+" ");
		}
		for(int i = 0; i<wordList.length; i++) {
			System.out.print(wordList[i]+" ");
		}
		
		
	}
}
