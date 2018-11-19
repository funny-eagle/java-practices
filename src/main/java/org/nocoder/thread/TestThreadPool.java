package org.nocoder.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class TestThreadPool {
    public static void main(String[] args) {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().build();

        ExecutorService executorService = new ThreadPoolExecutor(
                8,
                64,
                20000L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingDeque<>(1024),
                threadFactory,
                new ThreadPoolExecutor.CallerRunsPolicy());
        Thread t1 = new Thread(()->{
            int i = 0;
            while(i < 10000){
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName() + " hello ");
                });
                i++;
            }});

        t1.setName("test-thread");
        t1.start();
    }
}
