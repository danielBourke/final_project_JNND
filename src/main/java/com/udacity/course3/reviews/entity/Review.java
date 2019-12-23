package com.udacity.course3.reviews.entity;



import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name= "reviews")


public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;

    @ManyToOne
    private Product product;




    private String reviewername;

    private String review;

public Integer getReviewId() {return reviewId;}
public void setReviewId(Integer reviewId) {this.reviewId = reviewId;}
public Product getProduct(){return product;}
    public String getReviewername() {return reviewername;}
public void setReviewername(String reviewername) {this.reviewername = reviewername;}
public String getReview(){return review; }
public void setProduct(Product product) { this.product = product; }
public void setReview(String review) {this.review = review;}
}
