package com.nick.books_cms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowList {
    private Integer id;
    private Book book;
    private BorrowBatch batch;
    private Date returnDate;
}
