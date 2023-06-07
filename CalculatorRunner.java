class CalculatorRunner{
	public static void main(String args[]){
		
		//case1 - addition
		int sum1 = Calculator.add(50,20);
		System.out.println("Sum is:"+sum1);
		
		int sum2 = Calculator.add(45,20,80);
		System.out.println("Sum is:"+sum2);
		
		int sum3 = Calculator.add(75,66,54,79);
		System.out.println("Sum is:"+sum3);
		
		//case2 - subtraction
		int diff1 = Calculator.sub(80,65);
		System.out.println("Difference is:"+diff1);
		
		int diff2 = Calculator.sub(78,20,3);
		System.out.println("Difference is:"+diff2);
		
		int diff3 = Calculator.sub(8795,654,85);
		System.out.println("Difference is:"+diff3);
		
		//case3 - multiplication
		int mul1 = Calculator.mul(10,20);
		System.out.println("Multiple is:"+mul1);
		
		int mul2 = Calculator.mul(50,60,10);
		System.out.println("Multiple is:"+mul2);
		
		int mul3 = Calculator.mul(85,56,20,78);
		System.out.println("Multiple is:"+mul3);
		
		//case4 - division
		float div1 = Calculator.div(2,4);
		System.out.println("Result is:"+div1);
		
		float div2 = Calculator.div(3,9,81);
		System.out.println("Result is:"+div2);
		
		float div3 = Calculator.div(52,195,299,390);
		System.out.println("Result is:"+div3);
		
	}
}