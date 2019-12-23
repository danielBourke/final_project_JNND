package com.udacity.course3.reviews.entity.mongoEntities;



import com.udacity.course3.reviews.entity.Comment;
import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.entity.Review;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Document(collection = "reviews")

public class Reviewmongo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reviewId;
    private Product product;
    private String review;
    private String reviewername;
    private List<Commentsmongo> comment;


    public Reviewmongo() {
        comment = new ArrayList<>();
    }

    public Reviewmongo(Review review){
        if(review.getReviewId() != null){
            this.reviewId = review.getReviewId();
        }
        this.review = review.getReview();
        this.product = review.getProduct();

        comment = new ArrayList<>();
    }

    public void makeComment(Commentsmongo x){
        comment.add(x);
    }
    public Integer getId(){return reviewId;};

    public void setId(Integer _id){this.reviewId = _id;}


    public String getReview(){return review;}

    public void setReviewId(String _review){this.review = _review;}

    public Product getProduct(){return product;}

    public void setProduct(Product _product){this.product = product;}


    public List<Commentsmongo> getComments(){return comment;}

    public void setComment(List<Commentsmongo>_comment){
        this.comment = _comment;
    }






}
