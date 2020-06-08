package org.nocoder.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jason
 * @date 18/4/7.
 */
public class LambdaThread {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LambdaThread.class);

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                logger.info("i: {}", i);
            }
        }).start();
    }

}
