package com.org.prdcat.db.dao;

import com.org.prdcat.db.entity.Product;
import com.org.prdcat.db.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepo extends JpaRepository<Review, Integer> {

     List<Review> findAllByProduct(Product product);
}
