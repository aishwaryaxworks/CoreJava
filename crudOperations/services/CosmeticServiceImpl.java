package com.xworkz.crudOperations.services;

import com.xworkz.crudOperations.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService{
	
	@Override
	public boolean validateandsave(CosmeticDTO cdto) {
		System.out.println();
		if(cdto!=null) {
			System.out.println("good data");
			//get properties
			/*cdto.getBrand();
			cdto.getName();
			cdto.getPrice();*/
			
			if(cdto.getBrand()!=null && !cdto.getBrand().isEmpty() && cdto.getBrand().length()>=3 && cdto.getBrand().length()<30) {
				System.out.println("Brand is :"+cdto.getBrand());
			}else {
				System.err.println("Brand error...");
			}
			
			if(cdto.getName()!=null && !cdto.getName().isEmpty() && cdto.getName().length()>=3 && cdto.getName().length()<30) {
				System.out.println("Name of cosmetic is :"+cdto.getName());
			}else {
				System.err.println("Name error...");
			}
			
			if(cdto.getPrice() > 0 && cdto.getPrice()<10000) {
				System.out.println("Price is :"+cdto.getPrice());
			}else {
				System.err.println("Price error...");
			}
			
			//if(brand!=null && !brand.isEmpty() && brand.length()>=3 && brand.length <= 30) else err
			//if(name!=null && !name.isEmpty() && name.length()>=3 && name.length <= 30) else err
			//if(price > 0 && price < 100000 ) else err
			
		}else {
			System.out.println("bad data");
		}
		return true;
	}
}
