package com.nick.books_cms;

import com.nick.books_cms.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {

        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.debug("debug");

        User user = User.builder().idCard("1").name("zhangsan").build();
        System.out.println(user.toString());
    }
}
