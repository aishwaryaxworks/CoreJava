package com.xworkz.assignments.things;

public class Recipe {
	public String dishName;
	public int preparationTime;
	public boolean isVegetarian;
	public String[] ingredients;
	public String[] preparationType;
	public String[] cuisine;
	
	public void displayDish1(String[] ingredients) {
		this.ingredients = ingredients;
		for (int i=0; i<=ingredients.length-1; i++) {
			System.out.println("Ingredients:"+this.ingredients[i]);
		} 
	}

	public void displayDish2(String[] ingredients, String[] preparationType) {
		this.ingredients = ingredients;
		this.preparationType = preparationType;
		for (int i=0; i<=ingredients.length-1; i++) {
			System.out.println("Ingredients:"+this.ingredients[i]);
			System.out.println("Preparation Type:"+this.preparationType[i]);
		} 
	}

	public void displayDish3(String[] ingredients, String[] preparationType, String[] cuisine) {
		this.ingredients = ingredients;
		this.preparationType = preparationType;
		this.cuisine = cuisine;
		for (int i=0; i<=ingredients.length-1; i++) {
			System.out.println("Ingredients:"+this.ingredients[i]);
			System.out.println("Preparation Type:"+this.preparationType[i]);
			System.out.println("Cuisine:"+this.cuisine[i]);
		} 
	}

	public void displayDish4(String dishName, String ingredients[]) {
		this.dishName = dishName;
		this.ingredients = ingredients;
		for (int i=0; i<=ingredients.length-1; i++) {
			System.out.println("Dish Name:"+this.dishName+", Ingredients:"+this.ingredients[i]);
		} 
	}

	public void displayDish5(String dishName, int preparationTime, boolean isVegetarian, String ingredients[]) {
		this.dishName = dishName;
		this.preparationTime = preparationTime;
		this.isVegetarian = isVegetarian;
		this.ingredients = ingredients;
		for (int i=0; i<=ingredients.length-1; i++) {
			System.out.println("Dish Name:"+this.dishName+", Preparation Time:"+this.preparationTime+", "
					+ "Is Vegetarian?:"+this.isVegetarian+", Ingredients:"+this.ingredients[i]);
		} 
	}

	//No argument constructor
	public Recipe() {
		System.out.println("This no argument constructor.");
		System.out.println("---------------------");
	}

	//all argument constructor
	public Recipe(String dishName, int preparationTime, boolean isVegetarian, String[] ingredients, 
			String[] preparationType, String[] cuisine) {
		System.out.println("This is all argument constructor.");
		System.out.println("---------------------");
	}

	//one argument constructor
	public Recipe(String dishName) {
		this.dishName = dishName;
		System.out.println("This constructor accepts one argument.");
		System.out.println("Dish Name:"+this.dishName);
		System.out.println("---------------------");
	}

	//two argument constructor 
	public Recipe(String dishName, int preparationTime) {
		this.dishName = dishName;
		this.preparationTime = preparationTime;
		System.out.println("This constructor accepts two arguments.");
		System.out.println("Dish Name:"+this.dishName+", Preparation Time:"+this.preparationTime);
		System.out.println("---------------------");
	}

	//three argument constructor 
	public Recipe(String dishName, int preparationTime, boolean isVegetarian) {
		this.dishName = dishName;
		this.preparationTime = preparationTime;
		this.isVegetarian = isVegetarian;
		System.out.println("This constructor accepts three arguments.");
		System.out.println("Dish Name:"+this.dishName+", Preparation time:"+this.preparationTime+", "
				+ "Is Vegetarian?:"+this.isVegetarian);
		System.out.println("---------------------");
	}

	//one argument constructor - array
	public Recipe(String[] ingredients) {
		this.ingredients = ingredients;
		System.out.println("This constructor accepts one array.");
		displayDish1(ingredients);
		System.out.println("---------------------");
	}

	//two argument constructor - array
	public Recipe(String[] ingredients, String[] preparationType) {
		this.ingredients = ingredients;
		this.preparationType = preparationType;
		System.out.println("This constructor accepts two arrays.");
		displayDish2(ingredients, preparationType);
		System.out.println("---------------------");
	}

	//three argument constructor - array
	public Recipe(String[] ingredients, String[] preparationType, String[] cuisine) {
		this.ingredients = ingredients;
		this.preparationType = preparationType;
		this.cuisine = cuisine;
		System.out.println("This constructor accepts three arrays.");
		displayDish3(ingredients, preparationType, cuisine);
		System.out.println("---------------------");
	}

	//one argument - one array
	public Recipe(String dishName, String ingredients[]) {
		this.dishName = dishName;
		this.ingredients = ingredients;

		System.out.println("This constructor accepts one arguement and one array.");
		displayDish4(dishName, ingredients);		
		System.out.println("---------------------");
	}

	//three argument - one array
	public Recipe(String dishName, int preparationTime, boolean isVegetarian, String ingredients[]) {
		this.dishName = dishName;
		this.preparationTime = preparationTime;
		this.isVegetarian = isVegetarian;
		this.ingredients = ingredients;

		System.out.println("This constructor accepts three arguement and one array.");
		displayDish5(dishName, preparationTime, isVegetarian, ingredients);		
		System.out.println("---------------------");
	}
}
