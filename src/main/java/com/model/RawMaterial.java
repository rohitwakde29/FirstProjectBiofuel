package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RawMaterial {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long rawMaterialId;
	private String materialName;
//	private int quantity;
	private int price;

	public RawMaterial() {
	super();
}

	public RawMaterial(Long rawMaterialId, String materialName, int price) {
		super();
		this.rawMaterialId = rawMaterialId;
		this.materialName = materialName;
		this.price = price;
	}

	public Long getRawMaterialId() {
		return rawMaterialId;
	}

	public void setRawMaterialId(Long rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
}