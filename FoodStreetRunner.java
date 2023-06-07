class FoodStreetRunner{
	public static void main(String args[]){
		
		//case1:
		//implicit
		/*//FoodStreet.streetName("VV Puram", "KR Road", "Eat Street");
		//FoodStreet.streetName("KR Road");
		//FoodStreet.streetName("Eat Street");*/
		
		//explicit
		String streetName1[]={"Diagonal road", "Old Market Road", "Kormangala Food Street"};
		//for (int i=0; i<=streetName1.length; i++){
		FoodStreet.streetName(streetName1);
		//}
		
		//case2
		//implicit
		FoodStreet.streetName("Vada Pav", 50);
		//explicit
		String foodName1="Dabeli";
		int price1=20;
		FoodStreet.streetName(foodName1, price1);
		
		//case3
		//implicit
		FoodStreet.streetName("Tornado Potato", 25, 'V', false);
		//explicit
		String foodName2="Chicken65";
		int price2=40;
		char type='N';
		boolean availability=true;
		FoodStreet.streetName(foodName2, price2, type, availability);
		
		
		//case4
		//implicit
		FoodStreet.streetName("Ice Cream Roll","VV Puram","South End");
		//explicit
		String foodName3="Non-Veg Platter";
		String streetName2="Kormangala main road";
		String area="Kormangala";
		FoodStreet.streetName(foodName3, streetName2, area);
	}
}