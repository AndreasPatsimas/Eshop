package com.eshop.eshop.model.service_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.eshop.model.dao.ProductRepository;
import com.eshop.eshop.model.entity.Product;
import com.eshop.eshop.model.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public Product findById(int pid) {
		
		Optional<Product> result = productRepository.findById(pid);
		
		Product product = null;
		
		if(result.isPresent()) {
			product = result.get();
		}
		else {
			throw new RuntimeException("There is not a product with id - "+pid);
		}
		
		return product;
	}

	@Override
	public void saveOrUpdateProduct(Product product) {
		productRepository.save(product);
		// if product is null then save, else update
	}

	@Override
	public void deleteProductById(int pid) {
		productRepository.deleteById(pid);
	}

}
