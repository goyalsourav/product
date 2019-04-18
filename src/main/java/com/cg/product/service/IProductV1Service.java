package com.cg.product.service;

import java.util.List;

import com.cg.product.model.Product;
import com.cg.product.model.ProductV1;

public interface IProductV1Service {

	public List<ProductV1> findAll();

	public void save(ProductV1 product);

	public ProductV1 findById(Integer id);

}