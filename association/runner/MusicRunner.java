package com.xworkz.association.runner;

import com.xworkz.association.interfaces.MusicalInstruments;
import com.xworkz.association.things.Drum;
import com.xworkz.association.things.Music;
import com.xworkz.association.things.Piano;

public class MusicRunner {

	public static void main(String[] args) {
		//associating by type 1
		Music music = new Music();
		music.setType("romantic");
		music.setDuration(3.57f);
		music.setLyrics("saregama");
		
		if(music instanceof MusicalInstruments) {
		
		Drum drum1 = new Drum("Wooden",55.85,music);
		System.out.println(drum1.toString());
		System.out.println(drum1.getMusic().getDuration());
		System.out.println(drum1.getMusic().getLyrics());
		System.out.println(drum1.getMusic().getType());
		
		}else {
			System.out.println("Its not an instance!");
		}
		
		MusicalInstruments instruments = new Piano();
		instruments.play(false);
	}

}
