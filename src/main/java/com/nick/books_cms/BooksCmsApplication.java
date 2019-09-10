package com.nick.books_cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.nick.books_cms.mapper"})
public class BooksCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksCmsApplication.class, args);
    }

}
