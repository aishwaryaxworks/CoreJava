class Bank{
	public static void main(String args[]){
		System.out.println("Declaring array");
		#String accountHolders[]=null;
		String accountHolders[]={"ABC","XYZ"};
		System.out.println("printing array"+accountHolders);
		System.out.println("printing array"+accountHolders.length);
		
		System.out.println("reading values from array:"+accountHolders[0]);
		System.out.println("reading values from array:"+accountHolders[1]);
				#repeatedly calling each array in longer arrays causes complexity

		
		System.out.println("reading values from array:"+accountHolders[2]);
		# gives exception as arrayout of bound since the index does not exist
	
	}
}
