package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Warehouse;
import com.repository.WarehouseRepository;

@Service
public class WarehouseServiceImple implements WarehouseServiceInterface
{

	@Autowired
	WarehouseRepository warehouseRepo;
	
	
	@Override
	public Warehouse saveWarehouse(Warehouse w) {
		warehouseRepo.save(w);
		return w;
	}

	@Override
	public List<Warehouse> getAllWarehouse() {
		
		return warehouseRepo.findAll();
	}

	@Override
	public Warehouse getWarehouseById(long id) {
		
		return warehouseRepo.findById(id).orElse(null);
	}

	@Override
	public Warehouse updateWarehouse(Warehouse w) {
		Warehouse existWarehouse=warehouseRepo.findById(w.getWarehouseId()).orElse(null);
		existWarehouse.setAddress(w.getAddress());
		return warehouseRepo.save(existWarehouse);
	}

	@Override
	public void deleteWarehouse(long id) {
		warehouseRepo.deleteById(id);
	}

}
