package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Distributor;
import com.repository.DistributorRepository;

@Service
public class DistributorServiceImple implements DistributorServiceInterface {

	@Autowired
	DistributorRepository distributorRepo;

	@Override
	public Distributor saveDistributor(Distributor d) {
	    distributorRepo.save(d); 
		return d;
	}

	@Override
	public List<Distributor> getAllDistributor() {
		
		return distributorRepo.findAll();
	}

	
	@Override
	public Distributor getDistributorById(long id) {
		
		return distributorRepo.findById(id).orElse(null);
	}

	@Override
	public Distributor updateDistributor(Distributor d) {
		Distributor existDistributor=distributorRepo.findById(d.getDistributorId()).orElse(null);
		existDistributor.setName(d.getName());
		return distributorRepo.save(existDistributor);
	}
	
	
	
	@Override
	public List<String> getDistributorNames() {
		
		return distributorRepo.findDistibutorNames();
	}
	
	@Override
	public void deleteDistributor(long id) {
		distributorRepo.deleteById(id);
		
	}

	
	
}
