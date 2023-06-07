class IceCreamRunner{
	public static void main(String args[]){
		System.out.println("length of array is:"+IceCream.flavors.length);
		// here array iteration is not used, use if necessary.
		
		for(int i=0; i<IceCream.flavors.length; i++){
		System.out.println("Flavors of icecream are:"+IceCream.flavors[i]);
		System.out.println("Icecreams each sold online:"+IceCream.soldOnline[i]);
		System.out.println("Order id of of each icecream:"+IceCream.orderNumber[i]);
		System.out.println("Each Icecreams sold in real time:"+IceCream.soldRealTime[i]);
		System.out.println("Cost price of each icecream:"+IceCream.costPrice[i]);
		System.out.println("Customer rating for rach icecream:"+IceCream.customerRating[i]);
		System.out.println("Selling price of each icecream:"+IceCream.sellingPrice[i]);
		System.out.println("Flavor code of each icecream to order online:"+IceCream.flavorCode[i]);
		System.out.println("Is each icecream in stock:"+IceCream.inStock[i]);
		}
	}
}