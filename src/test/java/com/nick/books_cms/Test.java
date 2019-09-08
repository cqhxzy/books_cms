package com.nick.books_cms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    public static void main(String[] args) {

        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.debug("debug");
    }
}
