package com.org.prdcat.controller;

import com.org.prdcat.db.entity.Product;
import com.org.prdcat.db.entity.Review;
import com.org.prdcat.services.ProductService;
import com.org.prdcat.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @Autowired
    ProductService productService;

    @PostMapping(value = "/api/products/{productId}/reviews")
    public Review addProductReview(@PathVariable("productId") int productId,
                                   @RequestBody Review review){
        review.setProduct(productService.getProductById(productId));
        return reviewService.addReview(review);
    }

    @GetMapping(value = "/api/products/reviews")
    public String getReview1(){
       return "I am Sourav2_2345890";
    }

    @GetMapping(value = "/api/products/{productId}/reviews")
    public List<Review> getProductReview(@PathVariable("productId") int productId){
        return reviewService.getProductReview(productService.getProductById(productId));
    }
}
