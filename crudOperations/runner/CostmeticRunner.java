package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.CosmeticRepositoryImpl;
import com.xworkz.crudOperations.dto.CosmeticDTO;
import com.xworkz.crudOperations.interfaces.CosmeticRepository;

public class CostmeticRunner {
	public static void main(String[] args) {
		//brand:null, empty, min 3 chars, max 30 chars
		CosmeticDTO dto1 = new CosmeticDTO("compact powder", "Lakme", 250.00);
		System.out.println(dto1.toString());
		
		CosmeticDTO dto2 = new CosmeticDTO(null,"Lakme",250.00);
		CosmeticDTO dto3 = new CosmeticDTO(null,"",250.00);
		CosmeticDTO dto4 = new CosmeticDTO(null,null,-150);
		
		CosmeticRepository repo = new CosmeticRepositoryImpl();
		System.out.println(repo.validateandsave(dto1));
		System.out.println(repo.validateandsave(dto2));
		System.out.println(repo.validateandsave(dto3));
		System.out.println(repo.validateandsave(dto4));
	}
}
