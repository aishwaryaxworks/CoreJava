package com.xworkz.assignment2.things;

public class StringTask {
	char operator;
	int val1;
	int val2;
	long res;

	//case1
	public void operation(char operator, int val1, int val2) {
		this.operator=operator;
		if (this.operator=='+') {
			res=val1+val2;
			System.out.println("Result:"+res);
		}else if(this.operator=='-'){
			res=val1-val2;
			System.out.println("Result:"+res);
		}else if(this.operator=='*'){
			res=val1*val2;
			System.out.println("Result:"+res);
		}else if(this.operator=='/'){
			res=val1%val2;
			System.out.println("Reminder:"+res);
		}else {
			System.out.println("Wrong operator!");
		}
	}

	//case2
	public void multipleOfFive(int val3) {
		String stringval3=Integer.toString(val3);
		res=(val3*(5^stringval3.length()));
		System.out.println("Jack's trick number:"+res);
	}
	
	//case3
	public void nameSwap(String name) {
		System.out.println("Name before swapping:"+name);
		/*
		  String[] swappedName=name.split(" "); 
		  for(int i=0;i<swappedName.length;i++) {
		  	for(int j=swappedName.length;j>=0;j--) { 
		  		String swap=swappedName[j];
		  		swappedName[j]=swappedName[i]; 
		  		swappedName[i]=swap; 
		  	} 
		  }
		 */
		String firstName=name.substring(0,name.indexOf(" "));
        String lastName=name.substring(name.indexOf(" "));
        String swapName=lastName+" "+firstName;
        System.out.println("Name after swapping:"+swapName);
	}
	
	public static void main(String[] args) {
		StringTask operation = new StringTask();
		
		operation.operation('+', 20, 11);
		operation.operation('-', 20, 11);
		operation.operation('*', 20, 11);
		operation.operation('/', 20, 11);
		
		operation.multipleOfFive(18);
		operation.multipleOfFive(200);
		operation.multipleOfFive(3);
		
		operation.nameSwap("Aishwarya Naik");
		operation.nameSwap("Ravi Thakur");
	}

}
