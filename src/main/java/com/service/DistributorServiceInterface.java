package com.service;

import java.util.List;

import com.model.Distributor;



public interface DistributorServiceInterface {
	
	public Distributor saveDistributor(Distributor d);
	
	public List<Distributor> getAllDistributor();
	
	public Distributor getDistributorById(long id);
	
	public Distributor updateDistributor(Distributor d);

	public List<String> getDistributorNames();
	
	public void deleteDistributor(long id);
}
