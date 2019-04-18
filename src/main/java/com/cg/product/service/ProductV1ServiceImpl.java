package com.cg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.dao.ProductV1Dao;
import com.cg.product.model.ProductV1;

@Service("productV1Service")

public class ProductV1ServiceImpl implements IProductV1Service {
	
	@Autowired
	private ProductV1Dao productv1Dao;


	@Override
	public List<ProductV1> findAll() {
		List<ProductV1> productslist = productv1Dao.findAll();
		return productslist;
	}

	@Override
	public void save(ProductV1 productv1) {
	  productv1Dao.save(productv1);

	}

	@Override
	public ProductV1 findById(Integer id) {
		ProductV1 productv1 = productv1Dao.findById(id).get();
		return productv1;
	}

}
