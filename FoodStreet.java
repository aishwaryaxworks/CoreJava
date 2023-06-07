class FoodStreet{
	public static void streetName(String names[]){
		for (int i=0; i<names.length; i++){
			System.out.println("Names of streets:"+names[i]);
		}		
	}
	
	public static void streetName(String name, int price){
		System.out.println("Name of food : "+name+" and it's price is : "+price);
	}
	
	public static void streetName(String name, int price, char type, boolean available){
		System.out.println("Food "+name+" of Rs. "+price+ " is of type "+type+" & it's availability is "+available);
	}
	
	public static void streetName(String foodName, String stName, String area){
		System.out.println("Food:"+foodName+" is in Street:"+stName+" of Area:"+area);
	}
	
	/*//nested method
	// outer method
	public static void outer(){
		//inner method
		public static void inner(){
			System.out.println("Inner Method.");
		}
	}*/
}