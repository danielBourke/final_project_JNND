package com.udacity.course3.reviews.entity.mongoEntities;

import com.udacity.course3.reviews.entity.Comment;

public class Commentsmongo {

    private Integer id;
    private String title;
    private String text;

    public Commentsmongo(Comment comment){
        id: comment.getCommentId();
        title: comment.getTitle();
        text: comment.getContent();
    }
    public Integer getId(){return id;}


    public void setId(Integer id){this.id = id;}

    public String getTitle() {return title;}

    public  void setTitle(String title){this.title = title;}

    public String getText(){return text;}

    public  void setText(String text){this.text= text;}
}



