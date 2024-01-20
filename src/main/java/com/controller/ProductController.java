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

import com.model.Product;
import com.service.ProductServiceInterface;

@RestController
@RequestMapping("/products")
@CrossOrigin
public class ProductController {

	@Autowired
	ProductServiceInterface productService;
	
	@PostMapping("/saveProduct")
	public Product saveProduct(@RequestBody Product p) {
		productService.saveProduct(p);
		return p;
	}
	
	@GetMapping("/getAllProduct")
    public List<Product> findAllProduct() {
		
		return productService.getAllProduct();
	}
	
	@GetMapping("/getproduct/{id}")
    public Product findProductById(@PathVariable long id) {
		
		return productService.getProductById(id);
	}

	@PutMapping("updateProduct")
	public Product updateProduct(@RequestBody Product p) {
        return productService.updateProduct(p);
    }
	
	@GetMapping("/getProductNames")
    public List<String> searchProductNames() {
		return productService.getProductNames();
	}
	
	@DeleteMapping("/deleteProductbyid/{id}")
	public void deleteProduct(@PathVariable ("id")long id) {
		productService.deleteProduct(id);
		
	}
	

}
