package org.nocoder.thread.threadpool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * @author jason
 * @date 2019/5/7.
 */
public class ThreadPool {
    private static ExecutorService executorService = getExecutorService();
    private static ExecutorService getExecutorService() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("test-task-%d").build();
        ExecutorService executorService = new ThreadPoolExecutor(
                2, 10, 20000L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(2500),
                threadFactory, new ThreadPoolExecutor.CallerRunsPolicy());
        return executorService;
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " ");
        executorService.execute(()->{
            Future future = executorService.submit(new CallableTask());
            try {
                System.out.println(Thread.currentThread().getName() + ": 准备执行 future.get()");
                Object o = future.get();
                System.out.println(Thread.currentThread().getName() + ": future.get() 执行完毕," + "object=" + o.toString());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });
        System.out.println(Thread.currentThread().getName() + " 结束");
    }
}

class CallableTask implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + ": callable 线程启动");
        Thread.sleep(10000);
        String s = new String("a");
        System.out.println(Thread.currentThread().getName() + ": callable 线程执行完毕");
        return s;
    }
}
