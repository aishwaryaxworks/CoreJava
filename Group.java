class Group {
	public static void play(){
		event();
		System.out.println("This is play method.");
	}
	
	public static void event(){
		fest();
		System.out.println("This is event method.");
	}
	
	public static void fest(){
		//invoking method
		play();
		event();
		System.out.println("This is fest method.");
	}
}