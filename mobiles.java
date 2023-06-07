class Mobiles{
	static int version;
	static String series;
	static float release=11.5f;
	static double rerelease=13.4;
	static boolean released;
	public static void main(String a[]){
		System.out.println("Version before initialisation:"+version);
		version = 17;
		System.out.println("Version after initialisation:"+version);
		
		System.out.println("Series before initialisation:"+series);
		series="Galaxy";
		System.out.println("Series after initialisation:"+series);
		
		System.out.println("Release before change:"+release);
		release=12.5f;
		System.out.println("Release after change:"+release);
		
		System.out.println("Rerelease before change:"+rerelease);
		rerelease=13.5;
		System.out.println("Rerelease after change:"+rerelease);
		
		System.out.println("Is it released(before initialisation):"+released);
		released=true;
		System.out.println("Is it released(after initialisation):"+released);
	}
	
}
	