package org.nocoder.exception;


import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiThreadException {
    private static Logger logger = LoggerFactory.getLogger(MultiThreadException.class);
    public static void startSubThread(){
        Thread t = new Thread(()->{
            logger.debug("start to execute...");
            try{
                validateParam("");
            }catch (Exception e){
                logger.error("validate error:", e);
            }
            logger.debug("execute complete!");
        });
        t.start();
    }

    public static void validateParam(String param) throws IllegalArgumentException{
        logger.debug("start to validate param...");
        Validate.notEmpty(param);
        logger.debug("validate ok!");
    }

    public static void main(String[] args) {
        logger.debug("main start to execute...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startSubThread();
        logger.debug("main executing...");
        int i = 0;
        while(i<=10){
            try {
                logger.debug("i={}",i);
                i++;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
