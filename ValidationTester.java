package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.constants.CosmeticsShades;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;
import com.xworkz.cosmetics.services.CosmeticService;
import com.xworkz.cosmetics.services.CosmeticServiceImpl;


public class ValidationTester{ 

	public  static void main(String[] args) {
		
		//CosmeticDAO dao = new CosmeticDAOImpl();
		
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		
		cosmeticDTO.setBrand("MAC");
		cosmeticDTO.setType(CosmeticType.LIPSTICK);
		cosmeticDTO.setPrice(1000);
		cosmeticDTO.setShades(CosmeticsShades.BLUE);
		cosmeticDTO.setQuantity(30);
		//dao.save(null);
		
		CosmeticService service = new CosmeticServiceImpl();
		service.validDataAndSave(cosmeticDTO);
}
}