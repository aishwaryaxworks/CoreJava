package com.xworkz.crudOperations.interfaces;

public interface PoliticianRepository {
	int TOTAL_ITEMS =10;
	
	void save(String name);
	void display();
}
