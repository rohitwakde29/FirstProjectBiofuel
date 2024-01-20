package com.service;

import java.util.List;

import com.model.Supplier;

public interface SupplierServiceInterface {
	
	public Supplier saveSupplier(Supplier s);
	
	public List<Supplier> getAllSupplier();
	
	public Supplier getSupplierById(long id);
	
    public Supplier updateSupplier(Supplier s);
    
    public Supplier getByEmail(String email);
		
	public List<String> getSupplierNames();
	
	public void deleteSupplier(long id);
	

}
