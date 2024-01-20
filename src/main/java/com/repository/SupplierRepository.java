package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.model.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {



	Supplier findByEmail(String email);
	
	@Query("select s.supplierName from Supplier s")
	List<String> findSupplierNames();

}
