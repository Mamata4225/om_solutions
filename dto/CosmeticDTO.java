package com.xworkz.cosmetics.dto;

import com.xworkz.cosmetics.Shade;
import com.xworkz.cosmetics.constants.CosmeticType;
import com.xworkz.cosmetics.constants.CosmeticsShades;

public class CosmeticDTO {

	private String brand;
	private static CosmeticsShades shades;
	private CosmeticType type;
	private int price;
	private int quantity;

	public CosmeticDTO() {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static CosmeticsShades getShades() {
		return shades;
	}

	public void setType(CosmeticType type) {
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public CosmeticType getType() {
		return type;
	}

	public void setShades(CosmeticsShades shades) {
		this.shades = shades;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj != null) {
			if (obj instanceof CosmeticDTO) {
				CosmeticDTO dto = (CosmeticDTO) obj;
				if (dto.getBrand() != null && dto.getType() != null && dto.getBrand().equals(this.brand)
						&& dto.getType().equals(this.type))
					;
				System.out.println("brand and type are equal");
				return true;
			}
		}
		return false;

	}

	public void setCosmeticType(CosmeticType eyeliner) {
		// TODO Auto-generated method stub
		
	}

	public void setShade(Shade red) {
		// TODO Auto-generated method stub
		
	}

}
