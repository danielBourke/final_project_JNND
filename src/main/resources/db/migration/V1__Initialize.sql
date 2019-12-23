CREATE TABLE IF NOT EXISTS product (
    product_id INT AUTO_INCREMENT,
    productname VARCHAR(255),
    price VARCHAR(500),
    PRIMARY KEY (product_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS review (
    review_id INT AUTO_INCREMENT,

    reviews VARCHAR(255),
    reviewername VARCHAR(2000),
    PRIMARY KEY (review_id),
review VARCHAR(2000),
    product_id INT NOT NULL,
    FOREIGN KEY (product_id)
        REFERENCES product(product_id)
        ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS comment (
    comment_id INT AUTO_INCREMENT,
    title VARCHAR(255),
    content VARCHAR(2000),
    PRIMARY KEY (comment_id),
    review_id INT NOT NULL,
    FOREIGN KEY (review_id)
        REFERENCES review(review_id)
        ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;