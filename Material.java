class Material{
	
	//method without return type or with no parameters/arguements
	public static void use(){
		System.out.println("Method 'Use' with no parameters.");
	}
	
	//parameterized method but with no return type
	public static void use (String typeOfMaterial){
		System.out.println("Type of material is:"+typeOfMaterial);
	}
	
	//use of return keyword
	public static void use (int price, float weight){
		if (price<100 && weight < 10){
			System.out.println(" < Price and Weight is:"+price+ ","+weight);
			return;
		}
		else {
			System.out.println(" > Price and Weight is:"+price+ ","+weight);
			return;
			//System.out.println("---------------------------");
		}
	}
	
	/*//method with return type
	public static String use (String color, float size){
		return "This is a non primitive datatype return statement.";
	}
	*/
	
	public static String use (String color, float size){
		return color;
	}
	
	//public static int use(float size){
	public static int use (int size){
		return size;
	}
	
	public static int add(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
	
}