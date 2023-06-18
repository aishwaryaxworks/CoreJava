package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Car;

public class CarRunner {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("Ford","Mustang",1969,"Silver",13);
		car1.displayCar();
		car2.displayCar();

	}

}
