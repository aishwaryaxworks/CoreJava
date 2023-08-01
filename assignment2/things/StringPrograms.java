package com.xworkz.assignment2.things;

public class StringPrograms {
	public static void main(String[] args) {
		String og="Replace duplicate word with different word";
		String[] ogList=og.split(" ");
		System.out.println(og);
		//String ogList2="";

		//case1-replace duplicate words in string
		for (int i=0;i<ogList.length;i++) {
			for (int j=i+1;j<ogList.length;j++) {
				if(ogList[i].equals(ogList[j])) {
					System.out.println(og.replace("word", "phrase"));
				}
			}
		}

		//case2-upper to lower using inbuilt
		String og2=og.toUpperCase();
		System.out.println(og2);
		String og3=og.toLowerCase();
		System.out.println(og3);

		//case3-upper to lower without using inbuilt
		char og2str[]=og2.toCharArray();
		for(int i=0;i<og2str.length;i++)
		{
			if(og2str[i]>='A' && og2str[i]<='Z')
			{ 
				og2str[i]=(char)((int)og2str[i]+32);
			}
		}
		System.out.println("String in lowercase without using inbuilt functions:");
		for(int i=0;i<og2str.length;i++) {
			System.out.print(og2str[i]);
		}

	}
}
