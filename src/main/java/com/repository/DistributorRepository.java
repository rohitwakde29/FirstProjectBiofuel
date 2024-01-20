package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Distributor;

@Repository
public interface DistributorRepository extends JpaRepository<Distributor, Long> {

	@Query("select d.name from Distributor d")
	List<String> findDistibutorNames();
}
