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

import com.model.RawMaterial;
import com.service.RawMaterialServiceInterface;

@RestController
@RequestMapping("/rawmaterials")
@CrossOrigin
public class RawMaterialController {

	@Autowired 
	RawMaterialServiceInterface rawService;
	
	@PostMapping("/saveRawMaterial")
    public RawMaterial addRawMaterial(@RequestBody RawMaterial rawmaterial) {
		
		return rawService.saveRawMaterial(rawmaterial);
	}
	
	
    @GetMapping("/getAllRawMaterial")
	public List<RawMaterial> findAllRawMaterial() {
		
		return rawService.getAllRawMaterial();
	}
    

    @GetMapping("/getRawMaterial/{id}")
    public RawMaterial searchRawMaterialById(@PathVariable long id) {
		
		return rawService.getRawMaterialById(id);
	}
    
    @PutMapping("/updateRawMaterial")
	public RawMaterial updateRawMaterial(@RequestBody RawMaterial rawmaterial) {
        return rawService.updateRawMaterial(rawmaterial);
    }
	
    
    
	@GetMapping("getmaterialNames")
    public List<String> searchmaterialNames() {
		
		return rawService.getmaterialNames();
	}
	
	@DeleteMapping("deleteRawMaterialbyid/{id}")
	public void deleteRawMaterial(@PathVariable ("id")long id) {
		rawService.deleteRawMaterial(id);
		
	}
}
