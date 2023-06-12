public class WaterRunner{
	public static void main(String args[]){
		Water water1 = new Water();
		Water water2 = new Water();
		Water water3 = water1;
		
		if (water1 == water3){
			System.out.println("Memory address is same.");
		}
		else {
			System.out.println("Memory address is different.");
		}
	}
}