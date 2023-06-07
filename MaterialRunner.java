class MaterialRunner{
	public static void main (String args[]){
		
		Material.use();
		Material.use("Steel");
		Material.use(100,10f);
		Material.use(50,5.0f);
		
		Material.use("White",6.2f);
		
		String color=Material.use("White",150);
		System.out.println("Color is:"+color);
		
		System.out.println(Material.use("Red",5.3f));
		
		int size = Material.use(50);
		System.out.println("Size is:"+size);
		
		int sum = Material.use(20,30);
		System.out.println("Sum is:"+sum);
	}
}