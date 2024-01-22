package com.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Distributor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long distributorId;
	private String name;
	private String contactInfo;
	private String distributionRegion;
	
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Product> products;


	public Distributor() {
		super();
	}


	public Distributor(long distributorId, String name, String contactInfo, String distributionRegion, Date orderDate,
			List<Product> products) {
		super();
		this.distributorId = distributorId;
		this.name = name;
		this.contactInfo = contactInfo;
		this.distributionRegion = distributionRegion;
		this.orderDate = orderDate;
		this.products = products;
	}


	public long getDistributorId() {
		return distributorId;
	}


	public void setDistributorId(long distributorId) {
		this.distributorId = distributorId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContactInfo() {
		return contactInfo;
	}


	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}


	public String getDistributionRegion() {
		return distributionRegion;
	}


	public void setDistributionRegion(String distributionRegion) {
		this.distributionRegion = distributionRegion;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	
}
