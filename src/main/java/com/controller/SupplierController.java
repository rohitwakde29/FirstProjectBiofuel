package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Supplier;
import com.service.SupplierServiceInterface;

@RestController
@RequestMapping("/suppliers")
@CrossOrigin
public class SupplierController {

	@Autowired
	SupplierServiceInterface supplierService;
	
	@PostMapping("/saveSupplier")
	public Supplier saveSupplier(@RequestBody Supplier s) {
		supplierService.saveSupplier(s);
		return s;
	}
	
	@GetMapping("/getAllSupplier")
    public List<Supplier> findAllSupplier() {
		
		return supplierService.getAllSupplier();
	}
	
	@GetMapping("/getSupplier/{id}")
	public Supplier getSupplierById(@PathVariable long id) {
		return supplierService.getSupplierById(id);
		
	}
 
	@PutMapping("/update/supplier")
	public Supplier updateSupplier(@RequestBody Supplier s) {
        return supplierService.updateSupplier(s);
    }
	
	@GetMapping("getemail/{email}")
    public Supplier searchByEmail(@PathVariable String email) {
		
		return supplierService.getByEmail(email);
	}
    
    @GetMapping("getNames")
    public List<String> searchSupplierNames() {
		
		return supplierService.getSupplierNames();
	}
	
    @DeleteMapping("/deleteSupplierbyid/{id}")
    public void deleteSupplier(@PathVariable long id) {
		supplierService.deleteSupplier(id);
		
	}

}
