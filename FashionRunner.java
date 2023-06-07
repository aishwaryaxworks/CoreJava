class FashionRunner{
	public static void main(String args[]){
		int count=0;
		int countBrand=0;
		
		//count of repeated integer values
		for (int i=0; i<Fashion.inStoreStock.length; i++){
			if(Fashion.inStoreStock[i]==4){
				count+=1;
				System.out.println("Number of 4's in the array:"+count);
			}
		}
		
		//count of repeated sting values
		for(int i=0; i<Fashion.brand.length;i++){
			if(Fashion.brand[i]=="Dior"){
				countBrand+=1;
				System.out.println("Number of times Dior is repeated in array:"+countBrand);
			}
		}
	}
}