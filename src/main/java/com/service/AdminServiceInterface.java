package com.service;

import java.util.List;

import com.model.Admin;


public interface AdminServiceInterface {

    public Admin saveAdmin(Admin admin);
	
	public List<Admin> saveAllAdmin(List<Admin>list);
	
	public Admin getOneAdmin(long id);
	
	public List<Admin>getAllAdmin();
	
	public void deleteAdmin(long id);
}
