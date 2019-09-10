package com.nick.books_cms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowBatch {
    private Integer id;
    private String borrowNo;
    private User user;
    private Date borrowDate;
    private int state;
}
