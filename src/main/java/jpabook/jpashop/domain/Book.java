package jpabook.jpashop.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Item {

    private String author;
    private String isn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsn() {
        return isn;
    }

    public void setIsn(String isn) {
        this.isn = isn;
    }
}
