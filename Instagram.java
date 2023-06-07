class Instagram{
	public static void logIn(String name){
		System.out.println("name of person logged in:"+name);
	}
	
	public static void logIn(String name, int posts){
		System.out.println("person:"+name);
		System.out.println("posts:"+posts);
	}
	
	public static void logIn(int followers){
		System.out.println("Number of followers:"+followers);
	}
	
	public static void logIn(String name, int followers, boolean stat){
		System.out.println("Person:"+name);
		System.out.println("Followers:"+followers);
		System.out.println("Active:"+stat);
	}
	
	public static void logOut(){
		System.out.println("Person logged out");
	}
}