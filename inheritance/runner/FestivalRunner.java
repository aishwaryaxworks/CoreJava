package com.xworkz.inheritance.runner;

//import com.xworkz.inheritance.things.CulturalFestival;
//import com.xworkz.inheritance.things.ReligiousFestival;
//import com.xworkz.inheritance.things.SportsFestival;
//import com.xworkz.inheritance.things.MusicFestival;
import com.xworkz.inheritance.things.FoodFestival;

/*public class FestivalRunner extends CulturalFestival {

	public static void main(String[] args) {
		FestivalRunner fr = new FestivalRunner();
		fr.name="Graduation Day";
	}

}*/

/*public class FestivalRunner extends ReligiousFestival {

	public static void main(String[] args) {
		FestivalRunner fr = new FestivalRunner();
		fr.name="Thanks Giving";
	}

}*/

/*public class FestivalRunner extends SportsFestival {

	public static void main(String[] args) {
		FestivalRunner fr = new FestivalRunner();
		fr.activity="Playing games";
	}

}*/

/*public class FestivalRunner extends MusicFestival {

	public static void main(String[] args) {
		FestivalRunner fr = new FestivalRunner();
		String[] artistNames={"BTS","Charlie Puth"};
		fr.artists=artistNames;
	}

}*/

public class FestivalRunner extends FoodFestival {

	public static void main(String[] args) {
		FestivalRunner fr = new FestivalRunner();
		fr.location="V V Puram Food Street";
	}

}
