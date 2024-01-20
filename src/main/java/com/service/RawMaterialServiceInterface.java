package com.service;

import java.util.List;

import com.model.RawMaterial;


public interface RawMaterialServiceInterface {
	
public RawMaterial saveRawMaterial(RawMaterial rawmaterial);
	
	public List<RawMaterial> getAllRawMaterial();
	
	public RawMaterial getRawMaterialById(long id);
	
	public RawMaterial updateRawMaterial(RawMaterial rawmaterial);

	public List<String> getmaterialNames();
	
	public void deleteRawMaterial(long id);

	
}
