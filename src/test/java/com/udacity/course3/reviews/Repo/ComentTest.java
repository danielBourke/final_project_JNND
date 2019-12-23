package com.udacity.course3.reviews.Repo;

import com.udacity.course3.reviews.entity.Comment;
import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.entity.Review;
import com.udacity.course3.reviews.repository.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ComentTest {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired private EntityManager entityManager;

    @Test
    public void testFindAllByReviewId() {
        Product product = new Product();
        product.setProductname("shoes");

        entityManager.persist(product);
        entityManager.flush();

        Review review = new Review();
        review.setReview("good shoes");
        review.setProduct(product);

        entityManager.persist(review);
        entityManager.flush();



        Comment comment = new Comment();
        comment.setTitle("I like it");
        comment.setReview(review);

        entityManager.persist(comment);
        entityManager.flush();

        assertThat(product.getProductId()).isNotNull();
        assertThat(review.getReview()).isNotNull();
        assertThat(comment.getContent()).isNotNull();


    }
}
