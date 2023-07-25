package com.xworkz.inheritance.runner;

public class WrognRunner {
	public static final String name4 = "mohit";

	public static void main(String[] args) {
		String name1;
		name1 = "rohan";
		String name2 = "rohan";

		String name3 = new String();
		name3="Lohith";

		System.out.println(name1.equals(name2));
		System.out.println("Length of String:"+name3.length());

		name1.charAt(4);
		name3.compareTo(name1);
		name2.endsWith(" is the name !");
		name1.getBytes();
		name2.toLowerCase();
		name3.startsWith("m", 4);
		//System.out.println(name1 instanceof WrognRunner);

		//System.out.println(WrognRunner.name4="rohan");

		String name4 = "Hello everyone. Good to see you guys.";
		System.out.println(name4);
		System.out.println(name4.length());

		char[] name4List = name4.toCharArray();
		System.out.println(name4List.length);
		for (int i= 0; i<name4List.length; i++) {
			System.out.print(name4List[i]+"  ");

		}

		System.out.println();
		System.out.println(name4.split(" ").length);
		System.out.println(name4.split("y").length);
		System.out.println("----------------------------");

		String[] word1 = name4.split(" ");
		for(int i=0; i<word1.length; i++) {
			System.out.println(word1[i]);
		}
		System.out.println("----------------------------");

		String[] word2 = name4.split("e");
		for(int i=0; i<word2.length; i++) {
			System.out.println(word2[i]);
		}
		System.out.println("----------------------------");

		String[] word3 = name4.split(" ");
		for(int i=0; i<word3.length; i++) {
			if (word3[i].equals("Good")) {
				System.out.println(word3[i]);
			}else {
				System.out.println("no");
			}
		}
		System.out.println("----------------------------");

		char[] reverse = name4.toCharArray();
		for(int i = reverse.length-1; i>=0;i--) {
			System.out.print(reverse[i]+" ");
		}
		System.out.println();
		System.out.println("----------------------------");

		System.out.println("");

		name4.replaceAll("good", "bad");

	}
}
