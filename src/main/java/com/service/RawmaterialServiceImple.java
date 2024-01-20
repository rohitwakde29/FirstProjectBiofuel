package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.RawMaterial;
import com.repository.RawMaterialRepository;

@Service
public class RawmaterialServiceImple implements RawMaterialServiceInterface{

	@Autowired
	RawMaterialRepository rawRepo;
	
	@Override
	public RawMaterial saveRawMaterial(RawMaterial rawmaterial) {
		
		return rawRepo.save(rawmaterial);
	}
	

	@Override
	public List<RawMaterial> getAllRawMaterial() {
		
		return rawRepo.findAll();
	}

	@Override
	public RawMaterial getRawMaterialById(long id) {
		
		return rawRepo.findById(id).orElse(null);
	}

	@Override
	public RawMaterial updateRawMaterial(RawMaterial rawmaterial) {
		RawMaterial existRawMaterial=rawRepo.findById(rawmaterial.getRawMaterialId()).orElse(rawmaterial);
		existRawMaterial.setMaterialName(rawmaterial.getMaterialName());
		return rawRepo.save(existRawMaterial);
	}
	
	@Override
	public List<String> getmaterialNames() {
		
		return rawRepo.findmaterialNames();
	}


	@Override
	public void deleteRawMaterial(long id) {
		rawRepo.deleteById(id);
		
	}
	
}
