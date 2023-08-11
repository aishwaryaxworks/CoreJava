package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.PoliticianRepositoryImpl;
import com.xworkz.crudOperations.interfaces.PoliticianRepository;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianRepository repo = new PoliticianRepositoryImpl();
		repo.save("DKS");
		repo.save("BSY");
		repo.save("Modi");
		repo.save("Siddu");
		repo.save("HDK");
		repo.save("Deve Gowda");
		repo.save("Amit Shah");
		repo.save("Khejriwal");
		repo.save("Sriramulu");
		repo.save("Bommai");
		repo.save("Mamata Banerjee");
		
		repo.display();
	}

}
