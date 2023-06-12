public class ForestRunner{
	public static void main(String args[]){
		Forest forest1 = new Forest();
		Forest forest2 = new Forest();
		Forest forest3 = forest1;
		
		if (forest1 == forest3){
			System.out.println("Memory address is same.");
		}
		else {
			System.out.println("Memory address is different.");
		}
	}
}