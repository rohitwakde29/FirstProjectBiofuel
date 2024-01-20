package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceImple implements ProductServiceInterface  {

	@Autowired 
	ProductRepository  productRepo;

	@Override
	public Product saveProduct(Product p) {
		productRepo.save(p);
		return p;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(long id) {
		
		return productRepo.findById(id).orElse(null);
	}

	@Override
	public Product updateProduct(Product p) {
		Product existProduct=productRepo.findById(p.getProductId()).orElse(null);
		existProduct.setProductName(p.getProductName());
		return productRepo.save(existProduct);
	}
	
	@Override
	public List<String> getProductNames() {
		
		return productRepo.findproductNames();
	}

	@Override
	public void deleteProduct(long id) {
		productRepo.deleteById(id);
		
	}
	
}
