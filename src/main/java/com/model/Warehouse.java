package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Warehouse {

	@Id
	private long warehouseId;
	private String address;
	private long storageCapacity;
	public Warehouse() {
		super();
	}
	public Warehouse(long warehouseId, String address, long storageCapacity) {
		super();
		this.warehouseId = warehouseId;
		this.address = address;
		this.storageCapacity = storageCapacity;
	}
	public long getWarehouseId() {
		return warehouseId;
	}
	public void setWarehouseId(long warehouseId) {
		this.warehouseId = warehouseId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(long storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
	
	
}
