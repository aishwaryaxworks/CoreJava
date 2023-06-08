class OddCount{
	static int count;
	
	public static void evenCount(int number[]){
		
		count = 0;
		
		for(int i=0; i<number.length; i++){
			if (number[i] % 2 != 0){
				count+=1;
			}
		}
		
		System.out.println("The count of odd numbers in the array is: " + count);
	}
}