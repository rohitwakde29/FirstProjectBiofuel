package com.service;

import java.util.List;

import com.model.Company;

public interface CompanyServiceInterface {

	public Company saveCompany(Company company);
	
	public List<Company> saveAllCompany(List<Company>list);
	
	public Company getOneCompany(long id);
	
	public List<Company>getAllComapny();
	
	public void deleteCompany(long id);
	
	
}

