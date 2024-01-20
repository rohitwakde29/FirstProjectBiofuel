package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Company;
import com.service.CompanyServiceInterface;

@RestController
@CrossOrigin
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyServiceInterface comService;
	
	
	@PostMapping("add")
	public Company addCompany(@RequestBody Company company) {
		comService.saveCompany(company);
		return company;
	}
	
	@PostMapping("addAll")
	public List<Company> addAllCompany(@RequestBody List<Company> list) {
		comService.saveAllCompany(list);
		return list;
	}
	
	@GetMapping("/getOne/{id}")
	   public Company searchOneCompany(@PathVariable long id) {
			
			return comService.getOneCompany(id);
	}
	
	@GetMapping("getAll")
    public List<Company> getAllComapny() {
		
		return comService.getAllComapny();
	}

	
    @DeleteMapping("delete/{id}")
    public void deleteCompany(@PathVariable long id) {
		comService.deleteCompany(id);
		
	}
    
    

		
}
