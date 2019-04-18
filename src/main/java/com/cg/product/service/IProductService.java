package com.cg.product.service;

import java.util.List;

import com.cg.product.model.Product;

public interface IProductService {

	public List<Product> findAll();

	public void save(Product product);

	public Product findById(Integer id);

}