package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.Recipe;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe dish0 = new Recipe();
		Recipe dish1 = new Recipe("Pasta");
		Recipe dish2 = new Recipe("Pasta", 1);
		Recipe dish3 = new Recipe("Pasta", 1, true);
		
		String[] ingredients = {"Flour","Egg","Potato"};
		String[] preparationType = {"Machine", "By hand", "Pulling"};
		String[] cuisine = {"Italian","Thai","Chhinese"};
		
		Recipe dish4 = new Recipe(ingredients);
		Recipe dish5 = new Recipe(ingredients, preparationType);
		Recipe dish6 = new Recipe(ingredients, preparationType, cuisine);
		
		Recipe dish7 = new Recipe("Pasta", ingredients);
		Recipe dish8 = new Recipe("Pasta", 1, true, ingredients);
		Recipe dish9 = new Recipe("Pasta",1, true, ingredients,preparationType,cuisine);

	}

}
