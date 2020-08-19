package com.org.prdcat.db.dao;

import com.org.prdcat.db.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo  extends JpaRepository<Product,Integer> {

     Product findById(int productId);

     List<Product> findByNameContaining(String name);
}
