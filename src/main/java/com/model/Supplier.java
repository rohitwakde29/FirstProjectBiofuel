package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long supplierId;
    private String supplierName;
    
    @Column(nullable = false)
    private int quantity=0;
    private String email;
    private String phoneNo;
    
    @ManyToMany(fetch=FetchType.EAGER)
    private List<RawMaterial> rawmaterial;

	public Supplier() {
		super();
	}

	public Supplier(long supplierId, String supplierName, int quantity, String email, String phoneNo,
			List<RawMaterial> rawmaterial) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.quantity = quantity;
		this.email = email;
		this.phoneNo = phoneNo;
		this.rawmaterial = rawmaterial;
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public List<RawMaterial> getRawmaterial() {
		return rawmaterial;
	}

	public void setRawmaterial(List<RawMaterial> rawmaterial) {
		this.rawmaterial = rawmaterial;
	}

	
}
