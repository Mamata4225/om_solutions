package com.xworkz.cosmetics.dao;

import java.util.List;

import com.xworkz.cosmetics.dto.CosmeticDTO;

public interface CosmeticDAO {

	boolean save(CosmeticDTO dto);

	boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand);

	boolean updatePriceAndQuantityByType(double price, String brand, CosmeticDAO type);

	boolean deleteByBrand(String brand);

	void deleteAll();

	List<CosmeticDTO> getAll();

	int totalSize();

	boolean save1(CosmeticDTO dto);

}
