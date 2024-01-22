package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.SupplierUser;

public interface SupplierUserRepository extends JpaRepository<SupplierUser , Integer> {
	SupplierUser findBySuppemailid(String suppemailid);

	SupplierUser findBySuppemailidAndSupppassword(String suppemailid, String supppassword);

	
}
