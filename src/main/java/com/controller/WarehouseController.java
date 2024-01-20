package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Supplier;
import com.model.Warehouse;
import com.service.WarehouseServiceInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/warehouse")
public class WarehouseController {

	@Autowired
	WarehouseServiceInterface warehouseService;
	
	
	@PostMapping("/saveWarehouse")
	public Warehouse saveWarehouse(@RequestBody Warehouse w) {
		warehouseService.saveWarehouse(w);
		return w;
	}
	
    
	@GetMapping("/getAllWarehouse")
	public List<Warehouse> findAllWarehouse() {
		
		return warehouseService.getAllWarehouse();
	}
	
	
	@GetMapping("/getWarehouse/{id}")
    public Warehouse getWarehouseById(@PathVariable long id) {
		
		return warehouseService.getWarehouseById(id);
	}
	
	@PutMapping("/update/warehouse")
	public Warehouse updateWarehouse(@RequestBody Warehouse w) {
        return warehouseService.updateWarehouse(w);
    }
	
	 @DeleteMapping("/deleteWarehousebyid/{id}")
	    public void deleteWarehouse(@PathVariable long id) {
		 warehouseService.deleteWarehouse(id);
			
		}
	


	
	
	
}
