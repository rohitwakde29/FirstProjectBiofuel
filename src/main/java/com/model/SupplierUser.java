package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int suppId;
	
	private String suppEmailId;
	private String suppName;
	private String suppPassword;
	public SupplierUser() {
		super();
	}
	public SupplierUser(int suppId, String suppEmailId, String suppName, String suppPassword) {
		super();
		this.suppId = suppId;
		this.suppEmailId = suppEmailId;
		this.suppName = suppName;
		this.suppPassword = suppPassword;
	}
	public int getSuppId() {
		return suppId;
	}
	public void setSuppId(int suppId) {
		this.suppId = suppId;
	}
	public String getSuppEmailId() {
		return suppEmailId;
	}
	public void setSuppEmailId(String suppEmailId) {
		this.suppEmailId = suppEmailId;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	public String getSuppPassword() {
		return suppPassword;
	}
	public void setSuppPassword(String suppPassword) {
		this.suppPassword = suppPassword;
	}
	
	

}
