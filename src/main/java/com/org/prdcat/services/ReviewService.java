package com.org.prdcat.services;


import com.org.prdcat.db.dao.ReviewRepo;
import com.org.prdcat.db.entity.Product;
import com.org.prdcat.db.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepo reviewDao;

    public Review addReview(Review review){
        return reviewDao.save(review);
    }

    public List<Review> getProductReview(Product product){
        return reviewDao.findAllByProduct(product);
    }
}
