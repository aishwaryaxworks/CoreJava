package com.xworkz.techquest.things;

public class CountWords {
	public static void main(String[] args) {
		String string1="Paakashaala is a south Indian food chain.";
		String string2="Your delicious South Indian vegetarian food is served!";
		int count1=0;
		
		//case1
		String[] stringList1=string1.split(" ");
		String[] stringList2=string2.split(" ");
		for (int i=0; i<stringList1.length;i++) {
			for(int j=0;j<stringList2.length;j++) {
				if(stringList1[i].equals(stringList2[j])) {
					count1+=1;
				}
			}
		}
		System.out.println("Both sentences have "+count1+" number of similar words.");
		
		//case2
		int count2=0;
		char[] charList1=string1.toCharArray();
		for(int i=0; i<charList1.length;i++) {
			//for(int j=0; j<charList1.length; j++) {
			for(int j=i+1; j<charList1.length; j++) {
				if(charList1[i]==charList1[j]){
					count2+=1;
				}
			}
			//System.out.println("Repeated characters are:"+charList1[i]);
		}
		System.out.println("Number of repeated characters are:"+count2);
		
		//case1-option2
		String traineeNames="Aishwarya,Hari,Sarvesh,Sagar,Ravi,Aishwarya,Sarvesh";
		String[] traineeList=traineeNames.split(",");
		for(int i=0;i<traineeList.length;i++) {
			//System.out.println(traineeList[i]);
			for(int j=i+1;j<traineeList.length;j++) {
				if(traineeList[i].equals(traineeList[j])) {
					System.out.println("Repeated name is:"+traineeList[j]);
				}
			}
		}
		
	}
}
