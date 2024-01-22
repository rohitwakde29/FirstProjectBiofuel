package com.service;

import com.model.DistributorUser;

public interface DistributorUserServiceInterface {

	
public DistributorUser RegisterDistUser(DistributorUser distributoruser);
	
	public DistributorUser FindByDistemailid(String distemailid);
	
	public DistributorUser FindByDistemailidAndDistpassword(String distemailid,String distpassword);

}

