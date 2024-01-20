package com.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Admin;
import com.repository.AdminRepository;

@Service
public class AdminServiceImple implements AdminServiceInterface{

	@Autowired
	AdminRepository adminRepo;

	@Override
	public Admin saveAdmin(Admin admin) {
		adminRepo.save(admin);
		return admin;
	}

	@Override
	public List<Admin>saveAllAdmin(List<Admin> list) {
		adminRepo.saveAll(list);
		return list;
	}

	@Override
	public Admin getOneAdmin(long id) {
		
		return adminRepo.findById(id).orElse(null);
	}

	@Override
	public List<Admin>getAllAdmin() {
		
		return adminRepo.findAll();
	}

	@Override
	public void deleteAdmin(long id) {
		adminRepo.deleteById(id);
		
	}

	
	
	
}
