package com.eshop.eshop.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eshop.eshop.model.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
