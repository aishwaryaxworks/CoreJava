package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.dto.CosmeticDTO;
import com.xworkz.crudOperations.interfaces.CosmeticRepository;

public class CosmeticRepositoryImpl implements CosmeticRepository {
	private CosmeticDTO[] cosmetic = new CosmeticDTO[ITEMS];
	private int index = 0;

	@Override
	public boolean validateandsave(CosmeticDTO cosdto) {
		if (index < ITEMS) {
			if (cosdto.getBrand() != null && !cosdto.getBrand().isEmpty() && cosdto.getBrand().length() > 3
					&& cosdto.getBrand().length() < 30 && cosdto.getName() != null && !cosdto.getName().isEmpty() 
					&& cosdto.getName().length() > 3 && cosdto.getName().length() < 30 && cosdto.getPrice() > 0 
					&& cosdto.getPrice() < 2000000) {
				System.out.println(cosdto.getBrand() + " is cosmetic brand data...");
				this.cosmetic[index] = cosdto;
				this.index++;
			} else {
				System.err.println(cosdto + " is error in cosmetic data...");
			}
		}
		
		return false;
	}
}
