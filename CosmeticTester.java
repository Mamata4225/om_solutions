package com.xworkz.cosmetics;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.constants.CosmeticsShades;
import com.xworkz.cosmetics.dao.CosmeticDAO;
import com.xworkz.cosmetics.dao.CosmeticDAOImpl;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO cosmeticDTO = new CosmeticDTO();
		cosmeticDTO.setBrand("Maybelline");
		cosmeticDTO.setPrice(300);
		cosmeticDTO.setQuantity(50);
		cosmeticDTO.setShades(CosmeticsShades.BLUE);
		cosmeticDTO.setType(CosmeticType.EYELINER);
		
		CosmeticDAO dao = new CosmeticDAOImpl();
		dao.save(cosmeticDTO);
		
		CosmeticDTO cosmeticDTO2 = new CosmeticDTO("Lakme", CosmeticDAO.RED, CosmeticType.EYELINER,50,2);
		dao.save(cosmeticDTO2);
		
		CosmeticDTO cosmeticDTO3 = new CosmeticDTO("Lakme", CosmeticDAO.RED, CosmeticType.EYELINER,50,2);
		dao.save(cosmeticDTO3);	
	}
}
