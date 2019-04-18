package com.cg.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.dao.ProductDao;
import com.cg.product.model.Product;


@Service("productService")

public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> findAll() {
		List<Product> productslist = productDao.findAll();
		return productslist;
	}

	@Override
	public void save(Product product) {
		productDao.save(product);
		
	}

	@Override
	public Product findById(Integer id) {
		Product product = productDao.findById(id).get();
		return product;
	}

}
