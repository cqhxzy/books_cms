package com.nick.books_cms.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Integer id;
    private String userNo;
    private String name;
    private String idCard;
    private Integer role;
    private Integer state;
    private Date register;
}
