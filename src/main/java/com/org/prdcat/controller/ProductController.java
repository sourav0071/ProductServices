package com.org.prdcat.controller;

import com.org.prdcat.db.entity.Product;
import com.org.prdcat.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/api/products")
    public List<Product> getAllProductDetails(){
        return productService.getAllProductDetails();
    }

    @GetMapping(value = "/api/products/{productId}")
    public Product getProductDetails(@PathVariable("productId") int productId){
        return productService.getProductById(productId);
    }

    @GetMapping(value = "/api/products/byName/{name}")
    public List<Product> getProductByName(@PathVariable("name") String name){
        return productService.getProductNameContaining(name);
    }

    @PostMapping(value = "/api/products")
    public Product saveProductDetails(@RequestBody Product newProduct){
        return productService.saveProductDetails(newProduct);
    }

    @PostMapping(value = "/api/products/all")
    public List<Product> saveAllProductDetails(@RequestBody List<Product> newProduct){
        return productService.saveAllProductDetails(newProduct);
    }
}
