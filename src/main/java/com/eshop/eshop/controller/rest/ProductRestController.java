package com.eshop.eshop.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.eshop.model.entity.Product;
import com.eshop.eshop.model.service.ProductService;

@RestController
//@RequestMapping(value="products")
public class ProductRestController {

	ProductService productService;

	@Autowired
	public ProductRestController(ProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping(value="products")
	public List<Product> getProducts(){
		return productService.findAll();
	}
	
}
