package com.udacity.course3.reviews.Repo;

import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.entity.Review;
import com.udacity.course3.reviews.repository.ReviewRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;
@RunWith(SpringRunner.class)
@DataMongoTest
public class Reviewtest {
    @Autowired
    MongoTemplate mongoTemplate;
    @Autowired private ReviewRepository reviewRepository;




    @Autowired
    private EntityManager entityManager;

    @Test
    public void testFindReviewsByProductId() {
        Product product = new Product();
        product.setProductname("shoes");
        entityManager.persist(product);
        entityManager.flush();

        Review review = new Review();
        review.setReview("good review");
review.setProduct(product);
entityManager.persist(review);
entityManager.flush();

assertThat(product.getProductId()).isNotNull();


    }
}
