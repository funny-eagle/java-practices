package org.nocoder.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.*;

public class TestThreadPool {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(TestThreadPool.class);

        ThreadFactory threadFactory = new ThreadFactoryBuilder().build();

        ExecutorService executorService = new ThreadPoolExecutor(
                8, 200, 20000L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(1024),
                threadFactory, new ThreadPoolExecutor.CallerRunsPolicy());

        Thread t1 = new Thread(() -> {
            int i = 0;
            while (i < 10000) {
                executorService.execute(() -> {
                    logger.info("hello");
                });
                i++;
            }
        });

        t1.setName("test-thread");
        t1.start();
    }
}
