package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.DistributorUser;
import com.repository.DistributorUserRepository;

@Service
public class DistributorUserServiceImpl implements DistributorUserServiceInterface {

	@Autowired
	DistributorUserRepository distributorUserRepo;
	
	
	@Override
	public DistributorUser RegisterDistUser(DistributorUser distributoruser) {
		// TODO Auto-generated method stub
		return distributorUserRepo.save(distributoruser);
	}

	@Override
	public DistributorUser FindByDistemailid(String distemailid) {
		// TODO Auto-generated method stub
		return distributorUserRepo.findByDistemailid(distemailid);
	}

	@Override
	public DistributorUser FindByDistemailidAndDistpassword(String distemailid, String distpassword) {
		// TODO Auto-generated method stub
		return distributorUserRepo.findByDistemailidAndDistpassword(distemailid,distpassword);
	}

}
