package com.service;

import com.model.DistributorUser;

public interface DistributorUserServiceInterface {

public DistributorUser RegisterDistUser(DistributorUser distributoruser);
	
	public DistributorUser FindByDistemailid(String distEmailId);
	
	public DistributorUser FindByDistemailidAndDistpassword(String distEmailId,String distPassword);
}
