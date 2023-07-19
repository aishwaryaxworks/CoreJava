package com.xworks.may19th.things;

public class RainRunner {

	public static void main(String[] args) {
		Weather weather = new Weather();
		Rain rain1 = new Rain();
		rain1.display1();
		weather.display2("2 hrs");
		rain1.force();
		rain1.flood();
		rain1.wet();
		
		Rain rain2 = new Weather();
		rain2.flood();
		rain2.wet();
		
		Weather rain3 = new Weather();
		rain3.wet();

	}

}
