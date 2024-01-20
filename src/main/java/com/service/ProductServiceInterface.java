package com.service;

import java.util.List;

import com.model.Product;

public interface ProductServiceInterface {
	
    public Product saveProduct(Product p);
	
	public List<Product> getAllProduct();
	
	public Product getProductById(long id);
	
	public Product updateProduct(Product p);
	
	public List<String> getProductNames();
	
	public void deleteProduct(long id);

}
