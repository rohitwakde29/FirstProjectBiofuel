package com.service;

import com.model.SupplierUser;

public interface SupplierUserServiceInterface {
	

public SupplierUser RegisterSuppUser(SupplierUser supplieruser);
	
	public SupplierUser FindBySuppemailid(String suppemailid);
	
	public SupplierUser FindBySuppemailidAndSupppassword(String suppemailid,String supppassword);
}
