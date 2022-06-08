package org.nocoder.thread.threadpool;

import java.util.Date;
import java.util.concurrent.*;

public class FeatureTest {
    private static class Caller implements Callable<Boolean> {
        @Override
        public Boolean call() {
            try {
                System.out.println("执行任务，哦吼卡住了。。。");
                Thread.sleep(10000);
                System.out.println(new Date());
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }
    }

    private static class Runner implements Runnable {
        @Override
        public void run() {
            ExecutorService excutor = Executors.newSingleThreadExecutor();
            Future<Boolean> future = excutor.submit(new Caller());
            try {
                System.out.println("feature get ，设置了1秒超时，抛异常");
                future.get(1, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                System.out.println("catch 到timeout异常");
                future.cancel(true);
                System.out.println("feature cancel，继续跑");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new Runner(), 0, 1, TimeUnit.SECONDS);
    }
}
