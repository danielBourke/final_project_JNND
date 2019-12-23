package com.udacity.course3.reviews.entity;

import javax.persistence.*;

@Entity
@Table(name= "comment")


public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Integer commentId;

    @ManyToOne

    private Review review;

    @Column(name = "title")
    private String title;

    @Column(name= "content")
    private String content;

    public Integer getCommentId() {return commentId;}
    public void setCommentId(Integer commentId) {this.commentId = commentId;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getContent(){return content; }
    public void setContent(String content) {this.content = content;}
    public Review getReview(){return  review;}
    public void setReview(Review review){this.review = review;}
}

