package com.udacity.course3.reviews.repository;

import com.udacity.course3.reviews.entity.mongoEntities.Reviewmongo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepositoraryMongo extends MongoRepository<Reviewmongo, String> {
}



