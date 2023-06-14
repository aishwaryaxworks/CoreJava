package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.MusicAlbum;

public class MusicAlbumRunner {

	public static void main(String[] args) {
		MusicAlbum album0 = new MusicAlbum();
		MusicAlbum album1 = new MusicAlbum("Echoes of Solitude");
		MusicAlbum album2 = new MusicAlbum("Midnight Serenade","Luna Blue");
		MusicAlbum album3 = new MusicAlbum("Whispering Shadows","Scarlet Sky", false);
		MusicAlbum album4 = new MusicAlbum("Enigmatic Embrace","Ember Noir", true, false);
		MusicAlbum album5 = new MusicAlbum("Eternal Echoes","BTS", true, true, "https://open.spotify.com/artist/3Nrfpe0tUJi4K4DXYWgMUX");
		MusicAlbum album6 = new MusicAlbum("Serenade of Stardust","BTS", false, true, "https://open.spotify.com/artist/3Nrfpe0tUJi4K4DXYWgMUX", 43);

	}

}
