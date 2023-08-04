package com.xworkz.inheritance.runner;

public class StringPrograms {
	public static void main(String[] args) {
		String sentence = "This is the sentence to be reversed";
		System.out.println(sentence);
		
		//case1
		String[] sentenceList = sentence.split(" ");
		for(int i=sentenceList.length-1; i>=0; i--) {
			System.out.print(sentenceList[i]+" ");
		}
		
		//case2
		System.out.println();
		System.out.println(sentence.length());
		
		//case3
		String sentence2="good morning guys, how are you";
		String[] sentence2List = sentence2.split(" ");
		int count=0;
		for(int i=0; i<sentence2List.length;i++) {
			if(sentence2List[i].equals("morning")) {
				count+=1;
				System.out.println("Word is present "+count+" number of times.");
			}
		}
		
		//case4
		String sentence3="    good morning guys, how are you    ";
		String[] sentence3List=sentence3.split(" ");
		for(int i=0; i<sentence3List.length;i++) {
			if(sentenceList[i].equals(" ")) {
				System.out.println("Sentence contains blank spaces.");
			}
		}
		//sentence3.trim();
		
		//case5
		
		//case6
		String sentence4="Count the number of words in a sentence";
		String[] sentence4List = sentence4.split(" ");
		int count2=0;
		for(int i=0;i<sentence4List.length;i++) {
			count2+=1;
		}
		System.out.println("'"+sentence4+"' has "+count2+" words.");
		
		//case7
		String sentence5="Count only the a, e, i, o, u in a sentence";
		char[] vowelCount = sentence5.toCharArray();
		int count3=0;
		for(int i=0; i<vowelCount.length; i++) {
			if(vowelCount[i]=='a' || vowelCount[i]=='e' || vowelCount[i]=='i' || vowelCount[i]=='o' || vowelCount[i]=='u') {
				count3+=1;
			}
		}
		System.out.println("Number of vowels is:"+count3);
	}
}
