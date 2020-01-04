package com.udacity.course3.reviews.repository;

import com.udacity.course3.reviews.entity.Review;
import com.udacity.course3.reviews.entity.mongoEntities.Reviewmongo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepositoraryMongo extends MongoRepository<Reviewmongo, String> {
    List<Review> findReviewByProduct(int productId);
}



