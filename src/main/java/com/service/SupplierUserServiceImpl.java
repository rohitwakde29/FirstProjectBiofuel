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
		// TODO Auto-generated method stub
		return supplierUserRepo.save(supplieruser);
	}

	@Override
	public SupplierUser FindBySuppemailid(String suppemailid) {
		// TODO Auto-generated method stub
		return supplierUserRepo.findBySuppemailid(suppemailid);
	}

	@Override
	public SupplierUser FindBySuppemailidAndSupppassword(String suppemailid, String supppassword) {
		// TODO Auto-generated method stub
		return supplierUserRepo.findBySuppemailidAndSupppassword(suppemailid,supppassword);
	}
}
