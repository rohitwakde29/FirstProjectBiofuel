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
		
		return distributorUserRepo.save(distributoruser);
	}

	@Override
	public DistributorUser FindByDistemailid(String distEmailId) {
		
		return distributorUserRepo.findByDistEmailId(distEmailId);
	}

	@Override
	public DistributorUser FindByDistemailidAndDistpassword(String distEmailId, String distPassword) {
	
		return distributorUserRepo.findByDistEmailIdAndDistPassword(distEmailId, distPassword);
	}

}
