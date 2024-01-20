package com.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Company;
import com.model.Distributor;
import com.repository.CompanyRepository;

@Service
public class CompanyServiceImple implements CompanyServiceInterface  {

	@Autowired
	CompanyRepository comRepo;
	
	@Override
	public Company saveCompany(Company company) {
		comRepo.save(company);
		return company;
	}

	@Override
	public List<Company> saveAllCompany(List<Company> list) {
		comRepo.saveAll(list);
		return list;
	}
	@Override
	public Company getOneCompany(long id) {
		return comRepo.findById(id).orElse(null);
	}


	@Override
	public List<Company> getAllComapny() {
		
		return comRepo.findAll();
	}

	@Override
	public void deleteCompany(long id) {
		comRepo.deleteById(id);
		
	}

	
	
}
