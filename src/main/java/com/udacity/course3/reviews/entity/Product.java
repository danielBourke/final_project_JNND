package com.udacity.course3.reviews.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name= "product")


public class Product {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

  
    private String productname;



    private String price;

 


    public Integer getProductId() {return productId;}
    public void setProductId(Integer productId) {this.productId = productId;}
    public String getProductname() {return productname;}
    public void setProductname(String productname) {this.productname = productname;}
    public String getPrice(){return price; }
    public void setPrice(String price) {this.price = price;}
}
