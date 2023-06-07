class Calculator{
	
	public static int add(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	
	public static int add(int num1, int num2, int num3){
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public static int add(int num1, int num2, int num3, int num4){
		int sum = num1 + num2 + num3 + num4;
		return sum;
	}
	
	public static int sub(int num1, int num2){
		int diff = 0;
		if (num2>=num1){
			diff = num2 - num1;
		}
		return diff;
		
	}
	
	public static int sub(int num1, int num2, int num3){
		int diff = 0;
		if (num3>=num2 && num2>=num1){
			diff = num3 - num2 - num1;
		}
		return diff;
	}
	
	public static int sub(int num1, int num2, int num3, int num4){
		int diff = 0;
		if (num4>=num3 && num3>=num2 && num2>=num1){
			diff = num4 - num3 - num2 - num1;
		}
		return diff;
		
	}
	
	public static int mul(int num1, int num2){
		int multiple = num1 * num2;
		return multiple;
	}
	
	public static int mul(int num1, int num2, int num3){
		int multiple = num1 * num2 * num3;
		return multiple;
	}
	
	public static int mul(int num1, int num2, int num3, int num4){
		int multiple = num1 * num2 * num3 * num4;
		return multiple;
	}
	
	
	public static float div(float num1, float num2){
		float res = 0;
		if(num1<=num2){
			res = num1 / num2;
		}
		return res;
	}
	
	public static float div(float num1, float num2, float num3){
		float res = 0;
		if (num1<=num2 && num2<=num3){
			res = num3 /( num2 / num1);
		}
		return res;
	}
	
	public static float div(float num1, float num2, float num3, float num4){
		float res = 0;
		if (num1<=num2 && num2<=num3 && num3<=num4){
			res = num4 / (num3 / (num2 / num1));
			
		}
		return res;
		
	}
}