package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Admin {

	@Id
	private long adminId;
	private String username;
	private String password;
	
	private String name;
	private String contact;
	

    @OneToOne(cascade=CascadeType.ALL)
    private Company company;


	public Admin() {
		super();
	}


	public Admin(long adminId, String username, String password, String name, String contact, Company company) {
		super();
		this.adminId = adminId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.contact = contact;
		this.company = company;
	}


	public long getAdminId() {
		return adminId;
	}


	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}
    
    
    
    
}
