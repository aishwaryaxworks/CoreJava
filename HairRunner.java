public class HairRunner{
	public static void main(String args[]){
		Hair hair1 = new Hair();
		Hair hair2 = new Hair();
		Hair hair3 = hair1;
		
		if (hair1 == hair2){
			System.out.println("Memory address is same.");
		}
		else {
			System.out.println("Memory address is different.");
		}
	}
}