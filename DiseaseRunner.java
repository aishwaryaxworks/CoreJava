class DiseaseRunner{
	public static void main(String args[]){
		for (int i =0; i < Disease.nameOfDisease.length; i++){
			// System.out.println("i = "+i);
			if (Disease.nameOfDisease[i]==1){
				System.out.pritnln("Name of disease:"+Disease.nameOfDisease[i]);
			}
			else{
				System.out.println("element does not exist");
			}
		}
		
		for (int i =0; i < Disease.nameOfDisease.length; i++){
			if (Disease.nameOfDisease == "respiratory disease" ){
				System.out.pritnln("Name of disease:"+Disease.nameOfDisease);
			}
			else{
				System.out.println("element does not exist");
			}
		}
	}
}