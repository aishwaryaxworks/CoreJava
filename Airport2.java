class Airport2{
	public static void arrival(){
		departure();
		
		System.out.println("arrival method");
	}
	
	public static void departure(){
		check_in();
		System.out.println("departure method");
	}
	
	public static void check_in(){
		System.out.println("check_in method");
	}
}