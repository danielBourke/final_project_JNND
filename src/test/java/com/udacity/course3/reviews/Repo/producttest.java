package com.udacity.course3.reviews.Repo;
import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class producttest {
    @Autowired
    private ProductRepository repository;
    @Autowired
    private EntityManager entityManager;

    @Test
    public void testFindByProductId() {
        Product product = new Product();

        product.setProductname("phone");
        product.setPrice("23");

        entityManager.persist(product);
        entityManager.flush();
    }
}