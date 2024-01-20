package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.SupplierUser;
import com.repository.SupplierUserRepository;

@Service
public class SupplierUserServiceImpl implements SupplierUserServiceInterface{

	@Autowired
	SupplierUserRepository supplierUserRepo;

	@Override
	public SupplierUser RegisterSuppUser(SupplierUser supplieruser) {
		
		return supplierUserRepo.save(supplieruser);
	}

	@Override
	public SupplierUser FindBySuppemailid(String suppEmailId) {
		
		return supplierUserRepo.findBySuppEmailId(suppEmailId);
	}

	@Override
	public SupplierUser FindBySuppemailidAndSupppassword(String suppEmailId, String suppPassword) {
		
		return supplierUserRepo.findBySuppEmailIdAndSuppPassword(suppEmailId, suppPassword);
	}
}
