package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Distributor;
import com.model.Order;
import com.model.Supplier;
import com.service.DistributorServiceInterface;
import com.service.OrderServiceInterface;

@RestController
@RequestMapping("/distributors")
@CrossOrigin(origins="http://localhost:4200")
public class DistributorController {

	@Autowired
	DistributorServiceInterface distributorService;
	
	@PostMapping("/saveDistributor")
	public Distributor saveDistributor(@RequestBody Distributor d) {
		distributorService.saveDistributor(d);
		return d;
	}
	

	@GetMapping("/getAllDistributor")
   public List<Distributor> findAllDistributor() {
		
		return distributorService.getAllDistributor();
	}
	
  
	@GetMapping("/getDistributor/{id}")
	public Distributor searchDistributorById(@PathVariable long id) {
		
		return distributorService.getDistributorById(id);
	}
	
	@PutMapping("/updateDistributor")
	public Distributor updateDistributor(@RequestBody Distributor d) {
        return distributorService.updateDistributor(d);
    }
	
	@GetMapping("getNames")
    public List<String> searchDistributorNames() {
		
		return distributorService.getDistributorNames();
	}
	
	@DeleteMapping("/deleteDistributorbyid/{id}")
	public void deleteDistributor(@PathVariable ("id")long id) {
		distributorService.deleteDistributor(id);
		
	}
	

	
	
	
	
}
