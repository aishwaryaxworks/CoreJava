class Metro{
	public static void main(String args[]){
		// Declaring array and fixin array size
		String metroColor[] = new String[4]
		int metroStops[] = new int[4];
		
		// Adding elements to an array
		metroStops[0]=10;
		metroStops[1]=15;
		metroStops[2]=8;
		metroStops[3]=14;
		
		metroColor[0]="Green";
		metroColor[1]="Purple";
		metroColor[2]="Maroon";
		metroColor[3]="Yellow";
		
		System.out.println("Length of array is:"+metroColor.length);
		System.out.println("Length of array is:"+metroStops.length);
		
		for(int i=0; i<metroStops; i++){
			System.out.println("Stops in each metro line:"+metroStops[i]);
		}
		
		for(int i=0; i<metroColor; i++){
			System.out.println("Colors of metro line:"+metroColor[i]);
		}
	}
}