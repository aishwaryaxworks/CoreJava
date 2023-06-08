class Patterns {
    /* public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("& ");
            }
            System.out.println();
        }
    } */
	
	/* public static void main(String[] args) {
        int n = 3; // Number of lines in the pattern

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    } */
	
	/* public static void main(String[] args) {
        int n = 2; // Number of lines in the pattern

        for (int i = 0; i < n; i++) {
            System.out.print("@ ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("@");
        }
    }  */
	
	/* public static void main(String[] args) {
        int n = 3; // Number of lines in the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    } */
	
	/* public static void main(String[] args) {
        int n = 4; // Number of lines in the pattern

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            // for (int k = 0; k < i; k++) {
                // System.out.print(" ");
            // }
            System.out.println("#");
        }
    } */
	
	/*public static void main(String[] args){
		int i, j, n=8;  
		 
		for (i = 0; i<=n; i++){                                // Outer for loop for number of lines 
  
			for (j = 0; j<= n / 2; j++){  					   // Inner for loop for logic execution
				// prints two vertical lines  
				if ((j == 0 || j == n / 2) && i != 0 ||       // print first line of alphabet  
						i == 0  && j != n / 2 ||              // prints middle line  
						i == n / 2)  { 
								System.out.print("*"); 
						}
				else {
					System.out.print(" ");  
				}
			}  
			System.out.println();  
		}  
	}  */
	
	
	public static void main(String[] args) {
		int i, j, k, rows=9;     
		for (i=rows; i>= 1 ; i--){
			for (j = i; j<rows ; j++){
				System.out.print(" ");  
			}     
			
			for (k = 1; k <= (2*i -1) ;k++){
				if( k==1 || i == rows || k==(2*i-1)){
					System.out.print("#");
				}  
				else{
					System.out.print(" ");
				}  
			}  
			System.out.println("");  
		}  
	}  
	
	
}
