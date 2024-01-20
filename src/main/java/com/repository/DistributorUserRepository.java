package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.DistributorUser;

public interface DistributorUserRepository extends JpaRepository<DistributorUser , Integer> {

	DistributorUser findByDistEmailId(String distEmailId);

	DistributorUser findByDistEmailIdAndDistPassword(String distEmailId, String distPassword);
	
}
