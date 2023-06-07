class SupermarketRunner{
	public static void main(String args[]){
		
		//case1
		String itemName1[] = {"Sugar", "Salt", "Spices"};
		Supermarket.item(itemName1);
		
		//case2
		String itemName2[] = {"Plastic Box", "Dal", "Rice"};  
		int itemPrice1[] = {200, 40, 50};
		Supermarket.item(itemName2, itemPrice1);
		
		//case3
		String itemName3[] = {"Broom", "Whole masalas", "Rava"};
		int itemPrice2[] = {100, 150, 80};
		boolean availability = true;
		Supermarket.item(itemName3, itemPrice2, availability);
		
		//case4
		String itemName4[] = {"Masala Powders","Floor cleaners","Noodles"};
		String companyName[] = {"MTR", "Lizol","Buldak"};
		Supermarket.item(itemName4, companyName);
	}
}