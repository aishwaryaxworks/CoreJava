package com.xworkz.inheritance.things;

public class CountryRunner {
	
	public static void main(String[] args) {
		//Case 1
		Country c1 = new Country();
		
		India ind1 = new India();
		Nepal nep1 = new Nepal();
		
		Karnataka kar1 = new Karnataka();
		Kerala ker1 = new Kerala();
		TamilNadu tn1 = new TamilNadu();
		Madhesh mdh1 = new Madhesh();
		
		Bangalore bng1 = new Bangalore();
		Thiruvananthapuram thv1 = new Thiruvananthapuram();
		Chennai chn1 = new Chennai();
		Parsa par1 = new Parsa();
		
		System.out.println("--------------------------------------------------");
		
		//Case 2
		Karnataka kar2 = new Bangalore();
		India ind21 = new Bangalore();
		Country c21 = new Bangalore();
		Object o21 = new Bangalore();
		
		Kerala ker2 = new Thiruvananthapuram();
		India ind22 = new Thiruvananthapuram();
		Country c22 = new Thiruvananthapuram();
		Object o22 = new Thiruvananthapuram();
		
		TamilNadu tn2 = new Chennai();
		India ind23 = new Chennai();
		Country c23 = new Chennai();
		Object o23 = new Chennai();
		
		Madhesh mdh2 = new Parsa();
		Nepal nep24 = new Parsa();
		Country c24 = new Parsa();
		Object o24 = new Parsa();
		
		System.out.println("--------------------------------------------------");
		
		//Case 3
		India ind31 = new Karnataka();
		Country c31 = new Karnataka();
		Object o31 = new Karnataka();
		
		India ind32 = new Kerala();
		Country c32 = new Kerala();
		Object o32 = new Kerala();
		
		India ind33 = new TamilNadu();
		Country c33 = new TamilNadu();
		Object o33 = new TamilNadu();
		
		Nepal nep34 = new Madhesh();
		Country c34 = new Madhesh();
		Object o34 = new Madhesh();
		
		System.out.println("--------------------------------------------------");
		
		//Case 4
		Country c41 = new India();
		Object o41 = new India();
		
		Country c42 = new Nepal();
		Object o42 = new Nepal();
		
		System.out.println("--------------------------------------------------");
		
		//Case 5
		Object o51 = new Country();
		
	}

}
