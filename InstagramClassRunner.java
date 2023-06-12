public class InstagramClassRunner{
	
	public static void main (String args[]){
		InstagramClass instagram1 = new InstagramClass();
		InstagramClass instagram2 = new InstagramClass();
		InstagramClass instagram3 = instagram1;
		
		// instagram1.userName;
		// instagram1.password;
		
		if (instagram1 == instagram2 || instagram1 == instagram3){
			System.out.println("Memory address is same.");
		}
		else {
			System.out.println("Memory address is same");
		}

	}
	
	
}