class Airport1{
	public static void arrival(){
		departure();
		check_in();
		System.out.println("arrival method");
	}
	
	public static void departure(){
		System.out.println("departure method");
	}
	
	public static void check_in(){
		System.out.println("check_in method");
	}
}