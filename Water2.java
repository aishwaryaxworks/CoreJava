class Water2{
	public static void drink(){
		wash();
		
		System.out.println("drink method");
	}
	
	public static void wash(){
		bath();
		System.out.println("wash method");
	}
	
	public static void bath(){
		System.out.println("bath method");
	}
}