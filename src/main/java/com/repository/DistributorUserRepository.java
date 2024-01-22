package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.DistributorUser;

public interface DistributorUserRepository extends JpaRepository<DistributorUser , Integer> {


	DistributorUser findByDistemailid(String distemailid);

	DistributorUser findByDistemailidAndDistpassword(String distemailid, String distpassword);

}
