package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.SupplierUser;

public interface SupplierUserRepository extends JpaRepository<SupplierUser , Integer> {

	SupplierUser findBySuppEmailId(String suppEmailId);

	SupplierUser findBySuppEmailIdAndSuppPassword(String suppEmailId, String suppPassword);
}
