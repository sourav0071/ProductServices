package com.org.prdcat.services;

import com.org.prdcat.db.dao.ProductRepo;
import com.org.prdcat.db.entity.Product;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProductDetails(){
        return productRepo.findAll();
    }

    public List<Product> getProductNameContaining(String name){
        return productRepo.findByNameContaining(name);
    }

    public Product getProductById(int productId){
        return productRepo.findById(productId);
    }

    public Product saveProductDetails(Product product){
        return productRepo.save(product);
    }

    public List<Product> saveAllProductDetails(List<Product> productList){
        return productRepo.saveAll(productList);
    }
}
