package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Supplier;
import com.repository.SupplierRepository;

@Service
public class SupplierServiceImple implements SupplierServiceInterface{

	@Autowired
	SupplierRepository supplierRepo;

		
	@Override
	public Supplier saveSupplier(Supplier s) {
		supplierRepo.save(s);
		return s;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		
		return supplierRepo.findAll();
	}

	@Override
	public Supplier getSupplierById(long id) {
		return supplierRepo.findById(id).orElse(null);
		
	}

	@Override
	public Supplier updateSupplier(Supplier s) {
		Supplier existSupplier=supplierRepo.findById(s.getSupplierId()).orElse(null);
		existSupplier.setSupplierName(s.getSupplierName());
		return supplierRepo.save(existSupplier);
	}
	
	@Override
	public Supplier getByEmail(String email) {
		
		return supplierRepo.findByEmail(email);
	}

	@Override
	public List<String> getSupplierNames() {
		
		return supplierRepo.findSupplierNames();
	}

	@Override
	public void deleteSupplier(long id) {
		supplierRepo.deleteById(id);
		
	}

	
	
	
}
