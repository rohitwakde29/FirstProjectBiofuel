package com.service;

import com.model.SupplierUser;

public interface SupplierUserServiceInterface {
	
public SupplierUser RegisterSuppUser(SupplierUser supplieruser);
	
	public SupplierUser FindBySuppemailid(String suppEmailId);
	
	public SupplierUser FindBySuppemailidAndSupppassword(String suppEmailId,String suppPassword);

}
