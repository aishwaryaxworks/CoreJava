package com.xworkz.inheritance.things;

public class ApplicationRunner {

	public static void main(String[] args) {
		Instagram insta = new Instagram();
		Telegram tg = new Telegram();
		Whatsapp wa = new Whatsapp();
		LinkedIn li = new LinkedIn();
		Snapchat sc = new Snapchat();
		
		insta.caption="Do what you love.";
		insta.displayInstagram();
		
		tg.canCall=true;
		wa.attachPhoto=false;
		li.connections=500;
		sc.downloads=4000;
	}

}
