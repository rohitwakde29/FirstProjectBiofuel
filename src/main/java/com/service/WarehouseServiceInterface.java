package com.service;

import java.util.List;

import com.model.Warehouse;

public interface WarehouseServiceInterface {

public Warehouse saveWarehouse(Warehouse w);
	
	public List<Warehouse> getAllWarehouse();
	
	public Warehouse getWarehouseById(long id);
	
    public Warehouse updateWarehouse(Warehouse w);
    
    public void deleteWarehouse(long id);
}
