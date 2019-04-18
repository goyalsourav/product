package com.cg.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.product.model.Product;
import com.cg.product.model.ProductV1;
import com.cg.product.service.ProductServiceImpl;
import com.cg.product.service.ProductV1ServiceImpl;




@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;
	
	@Autowired
	private ProductV1ServiceImpl productv1Service;

	@GetMapping("/")
	public List<Product> findAll() {
		List<Product> productsList = productService.findAll();
	
		return productsList;
	}
	@PostMapping("/save")
	public List<Product> save(@RequestParam Integer id, @RequestParam String name, @RequestParam Double price) {
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		
		productService.save(product);
		List<Product> productsList = productService.findAll();

		
		return productsList;
	}
	
	@PostMapping("/savev1")
	public List<ProductV1> save(@RequestParam Integer id, @RequestParam String name, @RequestParam Double price, @RequestParam String category) {
		ProductV1 products = new ProductV1();
		products.setId(id);
		products.setName(name);
		products.setPrice(price);
		products.setCategory(category);
		productv1Service.save(products);
		List<ProductV1> productslist = productv1Service.findAll();
		return productslist;
	}

	@GetMapping("/retrieve")
	public Product retrieve(@RequestParam Integer id) {
		Product product = productService.findById(id);
		
		return product;
	}
	
	@GetMapping("/retrievev1")
	public ProductV1 retrievev1(@RequestParam Integer id) {
		ProductV1 productv1 = productv1Service.findById(id);
		
		return productv1;
	}

}
