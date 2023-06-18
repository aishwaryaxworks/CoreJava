package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.MusicAlbum;

public class MusicAlbumRunner {
	public static void main(String[] args) {
			MusicAlbum album1 = new MusicAlbum();
			MusicAlbum album2 = new MusicAlbum("Dynamite","BTS",2020,"K-Pop",1);
			album1.displayAlbum();
			album2.displayAlbum();

	}

}
