class Supermarket {
	public static void item(String nameOfItem[]){
		for(int i=0; i<nameOfItem.length; i++){
			System.out.println("Item name is:"+nameOfItem[i]);
		}
	}
	
	public static void item(String nameOfItem[], int price[]){
		for(int i=0; i<nameOfItem.length; i++){
			System.out.println("Item name is:"+nameOfItem[i]+" and Price:"+price[i]);
		}
	}
	
	public static void item(String nameOfItem[], int price[], boolean availbility){
		for(int i=0; i<nameOfItem.length; i++){
			System.out.println("Item name is:"+nameOfItem[i]+" and Price:"+price[i]+" Availability:"+availbility);
		}
	}
	
	public static void item(String nameOfItem[], String nameOfCompany[]){
		for(int i=0; i<nameOfItem.length; i++){
			System.out.println("Item name is:"+nameOfItem[i]+" and Company name is:"+nameOfCompany[i]);
		}
	}
	
}