package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.things.Coffee;
import com.xworkz.abstraction.things.Tea;
import com.xworkz.abstraction.things.TeaTime;

public class TeaTimeRunner{
	
	/*public void waiting() {
		System.out.println("this is subclass implementation of waiting method.");
	}*/
	
	public static void main(String[] args) {
		
		  TeaTime teatime1 = new Coffee(); 
		  teatime1.goodTime();
		  teatime1.wastingTime(); 
		  teatime1.review();
		  teatime1.waiting();
		  
		  TeaTime teatime2 = new Tea();
		  teatime2.waiting();
		  
	}
}
