package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Restaurant;

public class RestaurantRunner {

	public static void main(String[] args) {
		Restaurant restaurant1 = new Restaurant();
		Restaurant restaurant2 = new Restaurant("Spice Junction","Indian","Cityville, India",80,4.5);
		restaurant1.displayRestaurant();
		restaurant2.displayRestaurant();

	}

}
