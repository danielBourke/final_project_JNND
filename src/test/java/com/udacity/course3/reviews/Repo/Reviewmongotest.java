package com.udacity.course3.reviews.Repo;

import com.udacity.course3.reviews.entity.Comment;
import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.entity.Review;
import com.udacity.course3.reviews.entity.mongoEntities.Commentsmongo;
import com.udacity.course3.reviews.entity.mongoEntities.Reviewmongo;
import com.udacity.course3.reviews.repository.ReviewRepositoraryMongo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.List;

@RunWith(SpringRunner.class)
@DataMongoTest
public class Reviewmongotest {
@Autowired private ReviewRepositoraryMongo reviewRepositoraryMongo;

@Test
    public void reviewpersistance(){
        Product product = new Product();
        product.setProductname("One plus");
        product.setPrice("20");


    Review review = new Review();

    review.setReview("The best review");

  review.setReviewername("steve");
  review.setProduct(product);

    Comment firstComment = new Comment();

    firstComment.setContent("the best phone on the market by far");
    firstComment.setTitle("I agree");
firstComment.setReview(review);
    Reviewmongo reviewmongo = new Reviewmongo(review);

    reviewmongo.makeComment(new Commentsmongo((firstComment)));
    Reviewmongo savedReviewInfo = reviewRepositoraryMongo.save(reviewmongo);


    assertEquals(reviewmongo.getReview(), savedReviewInfo.getReview());




    }

}
