package com.nick.books_cms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BookCategory {
    private Integer id;
    private String category;
    private User creator;
    private Date addDate;
    private Date lastModify;
}
