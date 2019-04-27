package com.eshop.eshop.model.service;

import java.util.List;

import com.eshop.eshop.model.entity.Product;


public interface ProductService {

	public List<Product> findAll();
	
	public Product findById(int pid);
	
	public void saveOrUpdateProduct(Product product);
	
	public void deleteProductById(int pid);
}
