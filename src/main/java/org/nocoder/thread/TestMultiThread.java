package org.nocoder.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.*;

/**
 * @author jason
 * @date 2019/5/9.
 */
public class TestMultiThread {
    private static final ExecutorService executorService = getExecutorService();

    public static void main(String[] args) {
        // list 初始化
        List list = new ArrayList();
        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        List<Integer> l3 = new ArrayList();

        // 取模，将任务分成三组
        for (int i = 1; i <= list.size(); i++) {
            int a = i % 3;
            if (a == 0) {
                l1.add(i);
            }
            if (a == 1) {
                l2.add(i);
            }
            if (a == 2) {
                l3.add(i);
            }
        }

        // 使用一个线程安全的集合保存处理结果
        Vector vector = new Vector();

        // 多线程处理，将 处理结果 保存到 vector 中
        l1.forEach((v1) -> {
            Future future = executorService.submit(new CallableTask(v1));
            try {
                // get()这一步会阻塞主线程，等待子线程执行完才返回结果
                Integer val = (Integer) future.get();
                vector.add(val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        l2.forEach((v2) -> {
            Future future = executorService.submit(new CallableTask(v2));
            try {
                Integer val = (Integer) future.get();
                vector.add(val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        l3.forEach((v3) -> {
            Future future = executorService.submit(new CallableTask(v3));
            try {
                Integer val = (Integer) future.get();
                vector.add(val);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });


        // 打印 vector 结果
        vector.forEach((val) -> {
            System.out.print(val + "， ");
        });
    }

    private static ExecutorService getExecutorService() {
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("test-task-%d").build();
        ExecutorService executorService = new ThreadPoolExecutor(
                3, 3, 20000L,
                TimeUnit.MILLISECONDS, new LinkedBlockingDeque<>(2500),
                threadFactory, new ThreadPoolExecutor.CallerRunsPolicy());
        return executorService;
    }

}

class CallableTask implements Callable {

    private final Integer val;

    public CallableTask(Integer val) {
        this.val = val;
    }

    @Override
    public Object call() throws Exception {

        return val;
    }
}
