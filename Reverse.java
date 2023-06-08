class Reverse {
	public static void main(String args[]){
		String name = "Java Programming";
		
		for(int i=name.length()-1; i>=0; i--){
			System.out.print(name.chatAt(i));
		}
		
		System.out.println();
		System.out.println("--------------");
		
		char ch[] = name.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--){
			if( ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
			
			System.out.println(ch[i]);
			}
		}
		
		System.out.println("Char count:"+ch.length);
		
		
		
	}
}