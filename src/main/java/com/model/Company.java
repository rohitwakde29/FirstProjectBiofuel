package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {

	@Id
	private long companyId;
	private String name;
	private String address;
	private String email;
	
	@OneToMany(cascade=CascadeType.ALL)
    private List<Supplier> suppliers;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Product>products;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="warehouse_id")
	Warehouse warehouse;

	@OneToMany(cascade=CascadeType.ALL)
	private List<Distributor> distributors;
	
	

	public Company() {
		super();
	}

	public Company(long companyId, String name, String address, String email, List<Supplier> suppliers,
			List<Product> products, Warehouse warehouse, List<Distributor> distributors) {
		super();
		this.companyId = companyId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.suppliers = suppliers;
		this.products = products;
		this.warehouse = warehouse;
		this.distributors = distributors;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public List<Distributor> getDistributors() {
		return distributors;
	}

	public void setDistributors(List<Distributor> distributors) {
		this.distributors = distributors;
	}

	
	
}
