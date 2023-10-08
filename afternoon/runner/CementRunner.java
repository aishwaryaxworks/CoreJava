package com.xworkz.afternoon.runner;

import com.xworkz.afternoon.things.Cement;

public class CementRunner {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cement cement = new Cement();
		cement.setBagSizeInKilos(50);
		cement.setBrandName("Ambuja Cement");
		cement.setGrade("A");
		cement.setSettingTime(2.5);
		System.out.println("Values of Cement:" + cement);

		// clone1:
		Cement cement1 = (Cement) cement.clone();
		cement1.setBagSizeInKilos(60);
		cement1.setBrandName("Ultra Tech cement");
		cement1.setGrade("B");
		cement1.setSettingTime(3.0);
		System.out.println("Values of cement1:" + cement1);

		// clone2:
		Cement cement2 = (Cement) cement.clone();
		cement2.setBagSizeInKilos(70);
		cement2.setBrandName("JK cement");
		cement2.setGrade("C");
		cement2.setSettingTime(3.5);
		System.out.println("Values of cement2:" + cement2);

		// clone3:
		Cement cement3 = (Cement) cement.clone();
		cement3.setBagSizeInKilos(80);
		cement3.setBrandName("Ambhuja cements");
		cement3.setGrade("D");
		cement3.setSettingTime(4.0);
		System.out.println("Values of cement3:" + cement3);

		// clone4:
		Cement cement4 = (Cement) cement.clone();
		cement4.setBagSizeInKilos(90);
		cement4.setBrandName("India cements");
		cement4.setGrade("E");
		cement4.setSettingTime(4.5);
		System.out.println("Values of cement4:" + cement4);

		// clone5:
		Cement cement5 = (Cement) cement.clone();
		cement5.setBagSizeInKilos(100);
		cement5.setBrandName("Birla Corporation cement");
		cement5.setGrade("F");
		cement5.setSettingTime(5.0);
		System.out.println("Values of cement5:" + cement5);

		// clone6:
		Cement cement6 = (Cement) cement.clone();
		cement6.setBagSizeInKilos(110);
		cement6.setBrandName("Ramco cement");
		cement6.setGrade("G");
		cement6.setSettingTime(5.5);
		System.out.println("Values of cement6:" + cement6);

		// clone7:
		Cement cement7 = (Cement) cement.clone();
		cement7.setBagSizeInKilos(120);
		cement7.setBrandName("India Cements Ltd");
		cement7.setGrade("H");
		cement7.setSettingTime(6.0);
		System.out.println("Values of cement7:" + cement7);

		// clone8:
		Cement cement8 = (Cement) cement.clone();
		cement8.setBagSizeInKilos(130);
		cement8.setBrandName("Dalmia cement");
		cement8.setGrade("I");
		cement8.setSettingTime(6.5);
		System.out.println("Values of cement8:" + cement8);

		// clone9:
		Cement cement9 = (Cement) cement.clone();
		cement9.setBagSizeInKilos(140);
		cement9.setBrandName("Binani cement");
		cement9.setGrade("J");
		cement9.setSettingTime(7.0);
		System.out.println("Values of cement9:" + cement9);

		// clone10:
		Cement cement10 = (Cement) cement.clone();
		cement10.setBagSizeInKilos(150);
		cement10.setBrandName("JayPee cement");
		cement10.setGrade("K");
		cement10.setSettingTime(7.5);
		System.out.println("Values of cement10:" + cement10);

	}

}
