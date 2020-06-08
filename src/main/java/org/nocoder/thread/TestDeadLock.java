package org.nocoder.thread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDeadLock {

    public static Logger logger = LoggerFactory.getLogger(TestDeadLock.class);

    public static void createLoopThread() {
        Thread t1 = new Thread(() -> {
            while (true) ;
        }, "test-loop-thread");
        t1.start();
    }

    public static void createLockThread(final Object lock) {
        Thread t2 = new Thread(() -> {
            System.out.println("t2 created");
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "test-lock-thread");
        t2.start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new SyncConcatString("hello", "world")).start();
            new Thread(new SyncConcatString("world", "hello")).start();
        }
        //TestDeadLock.createLoopThread();
        //TestDeadLock.createLockThread("a");
    }

    static class SyncConcatString implements Runnable {
        String a;
        String b;

        public SyncConcatString(String a, String b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            logger.info("{} start", Thread.currentThread().getName());
            synchronized (a) {
                logger.info("{} lock the param a: {}, hashcode:{}", Thread.currentThread().getName(), a, a.hashCode());
                synchronized (b) {
                    logger.info("{} lock the param b: {}, hashcode:{}", Thread.currentThread().getName(), b, b.hashCode());
                    logger.info(a + "-" + b);
                }
            }
            logger.info("{} end", Thread.currentThread().getName());
            ;
        }
    }
}
