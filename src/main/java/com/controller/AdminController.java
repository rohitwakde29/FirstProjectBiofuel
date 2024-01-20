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

import com.model.Admin;
import com.service.AdminServiceInterface;

@RestController
@RequestMapping("/admins")
@CrossOrigin(origins="http://localhost:4200")
public class AdminController {

	@Autowired
	AdminServiceInterface adminService;
	
	@PostMapping("save")
	public Admin addAdmin(@RequestBody Admin admin) {
		adminService.saveAdmin(admin);
		return admin;
	}
	
	@PostMapping("saveAll")
	public List<Admin>addAllAdmin(@RequestBody List<Admin> list) {
		adminService.saveAllAdmin(list);
		return list;
	}
	
	@GetMapping("searchOne/{id}")
    public Admin searchOneAdmin(@PathVariable long id) {
		
		return adminService.getOneAdmin(id);
	}
	
	@GetMapping("searchAll")
    public List<Admin>getAllAdmin() {
		
		return adminService.getAllAdmin();
	}
	
	@DeleteMapping("remove/{id}")
	public void deleteAdmin(@PathVariable long id) {
		adminService.deleteAdmin(id);
		
	}
	


}

