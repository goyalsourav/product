package com.cg.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.product.model.ProductV1;

public interface ProductV1Dao extends JpaRepository<ProductV1, Integer> {

}