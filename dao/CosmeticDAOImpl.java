package com.xworkz.cosmetics.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.dto.CosmeticDTO;

public abstract class CosmeticDAOImpl implements CosmeticDAO {

	private List<CosmeticDTO> database;

	public CosmeticDAOImpl() {
		this.database = new ArrayList<CosmeticDTO>();

	}

	@Override
	public boolean save(CosmeticDTO dto) {
		boolean added = false;
		System.out.println("invoked save method");
		if (!this.database.contains(dto)) {
			added = this.database.add(dto);

		}
		if (added) {
			System.out.println("item added" + dto);
			return true;
		} else {
			System.out.println("item not added");
		}
		return false;
	}

	@Override
	public boolean updatePriceAndQuantityByBrand(double price, int quantity, String brand) {
		return false;
	}

	public boolean updatePriceAndQuantityByType(double price, String brand, CosmeticType type) {
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		return false;
	}

	@Override
	public void deleteAll() {

	}

	@Override
	public List<CosmeticDTO> getAll() {
		return null;
	}

	@Override
	public int totalSize() {
		return 0;
	}

}
