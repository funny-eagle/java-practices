package org.nocoder.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4j {
    public static Logger logger = LoggerFactory.getLogger(TestSlf4j.class);

    public static void main(String[] args) {
        logger.warn("this is a warn log, {}", "warning...");
        logger.error("this is an error log, {}", "SomeException");
        logger.info("this is an info log, {}", "some information");
        logger.debug("this is debug log, a:{}, b:{}", "a", "b");
    }
}
