package com.nick.books_cms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Book {
    private Integer id;
    private String bookNo;
    private String name;
    private String author;
    private String publishDate;
    private String publisher;
    private Date inDate;
    private Integer inCount;
    private Integer currentCount;
    private BookCategory category;
    private User user;
    private Double price;
    private Date lastModify;
    private Integer state;
}
