package com.xworkz.cosmetics.services;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.constants.CosmeticsShades;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticServiceImpl implements CosmeticService{
	
	public CosmeticServiceImpl() {
		System.out.println("created");
	}


public boolean validDataAndSave(CosmeticDTO cosmeticDTO) {
	boolean validData = false;
	
	if(cosmeticDTO!=null) {
		System.out.println("dto is not null, will validate field");
	 String brand = cosmeticDTO.getBrand();
	 
	 if(brand!=null && brand.length()>=3 && !brand.isEmpty() && !brand.contains(" ")) {
		 System.out.println("brand is valid");
		  validData = true;
	 }
	 else {
		 System.out.println("brand is invalid");
		  validData = false;
	 }
	 
	 if(validData) {
		 CosmeticType type = cosmeticDTO.getType();
		 if (type!=null) {
			 System.out.println("type is valid");
			 validData=true;
		 }
		 else {
			 System.out.println("type is invalid");
			 validData=false;
		 }
	 }
	if(validData) {
		 CosmeticsShades shade = CosmeticDTO.getShades();
		 if (shade!=null) {
			 System.out.println("shade is valid");
			 validData=true;
		 }
		 else {
			 System.out.println("shade is invalid");
			 validData=false;
		 }
	 }
	if(validData) {
		double price = cosmeticDTO.getPrice();
		if(price>100) {
			System.out.println("price is valid");
		validData = true;
		}
		else
		{
			System.out.println("price is invalid");
			validData = false;
		}
	}
	if(validData) {
		int quantity = cosmeticDTO.getQuantity();
		if(quantity>0 && quantity<=50 ) {
			System.out.println("quantity is valid");
			validData = true;
		}
		else {
			System.out.println("quantity is invalid");
			validData = false;
		}
	}
	 }
	if(validData) {
		System.out.println("data is valid, can invoke dto ");
		return true;
	}
	else {
		 System.out.println("dto is null, invalid type");
	}
	return false;
}
}

