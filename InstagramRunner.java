class InstagramRunner{
	public static void main(String args[]){
		
		//Implicitly passed
		Instagram.logIn("Aishwarya");
		//Explicitly passed
		String name1 = "Ravi";
		Instagram.logIn(name1);
		
		//Implictly passed
		Instagram.logIn("Aishwarya", 50);
		//Explictly passed
		String name2 = "Sarvesh";
		int posts = 20;
		Instagram.logIn(name2,posts);
		
		//Implicitly passed
		Instagram.logIn(100);
		//Explicitly passed
		int followers1 = 200;
		Instagram.logIn(followers1);
		
		//Implicitly passed
		Instagram.logIn("Aishwarya",100, false);
		//Explicitly passed
		String name3 = "Hari";
		int followers2 = 200;
		boolean stat=true;
		Instagram.logIn(name3, followers2, stat);
	}
}