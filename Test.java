class Test{
	public static void main(String args[]){
		for (int i = 0; i<=5; i++){
			System.out.println("*");
		}
		
		for (int i = 0; i<=5; i++){
			System.out.print("* ");
		}
		
		for (int i = 0; i<=5; i++){
			System.out.print(i+ " ");
		}
		
		for (int i = 0; i<=5; i++){
			for (int j = 0; j<=5; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i<=5; i++){
			for (int j = 0; j<=5; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i<=5; i++){
			for (int j = 0; j<=5; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for (int i = 0; i<=5; i++){
			for (int j = 0; j<=5; j++){
				if(j==2){
					System.out.print(" &");
				}
				else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i<=5; i++){
			for (int j = 0; j<=5; j++){
				if(j==2 && i == 5){
					System.out.print(" &");
				}
				else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i<=5; i++){         // represents rows
			for (int j = 0; j<=5; j++){
				if(j==2 || i == 5){         // represents columns
					System.out.print(" &");
				}
				else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 0; i<=5; i++){
			for (int j = 0; j<=5; j++){
				if(j==2 || i == 5){
					System.out.print("& ");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}