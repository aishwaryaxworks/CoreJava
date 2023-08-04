package com.xworkz.assignment2.things;

import java.util.ArrayList;
import java.util.HashMap;

public class Breakfast {
	private int id;
	private double price;
	private boolean isVegetarian;
	private char category;
	private String name;
	private Integer ingredients;
	private Double nutritionInfo;
	private String chef;
	private Character menu;

	public Breakfast(int id, double price, boolean isVegetarian, char category, String name, Integer ingredients,
			Double nutritionInfo, String chef, Character menu) {
		this.id = id;
		this.price = price;
		this.isVegetarian = isVegetarian;
		this.category = category;
		this.name = name;
		this.ingredients = ingredients;
		this.nutritionInfo = nutritionInfo;
		this.chef = chef;
		this.menu = menu;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIngredients() {
		return ingredients;
	}

	public void setIngredients(Integer ingredients) {
		this.ingredients = ingredients;
	}

	public Double getNutritionInfo() {
		return nutritionInfo;
	}

	public void setNutritionInfo(Double nutritionInfo) {
		this.nutritionInfo = nutritionInfo;
	}

	public String getChef() {
		return chef;
	}

	public void setChef(String chef) {
		this.chef = chef;
	}

	public Character getMenu() {
		return menu;
	}

	public void setMenu(Character menu) {
		this.menu = menu;
	}


	@Override
	public String toString() {
		return "Breakfast [id=" + id + ", price=" + price + ", isVegetarian=" + isVegetarian + ", category=" + category
				+ ", name=" + name + ", ingredients=" + ingredients + ", nutritionInfo=" + nutritionInfo + ", chef="
				+ chef + ", menu=" + menu + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
    	if(getClass() != obj.getClass()) 
    		return false;
    	Breakfast bf = (Breakfast)obj;
    	if(this.id == bf.id && this.price == bf.price && this.isVegetarian == bf.isVegetarian && this.category == bf.category && 
    			this.name.equals(bf.name) && this.ingredients == bf.ingredients && this.nutritionInfo == bf.nutritionInfo && 
    			this.chef.equals(bf.chef) && this.menu == bf.menu)
    		return true;
		return false;
	}
}