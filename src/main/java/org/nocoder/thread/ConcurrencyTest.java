package org.nocoder.thread;

/**
 * 测试上下文切换的开销
 * @author YANGJINLONG
 */
public class ConcurrencyTest {

    private static int count = 1000000001;

    public static void main(String[] args) throws InterruptedException {
        /**
         * 测试结论
         * 一万 10001;  m=1025, s=1015
         * 十万 100001; m=1025, s=639
         * 一百万 1000001; m=1018, s=642
         * 一千万 10000001; m=1030 s=640
         * 一亿 100000001 m=1028 s=679
         * 十亿 1000000001 m=1027 s=1083
         */
        calculateWithMultiThread();
        calculateWithSingleThread();
    }

    /**
     * 使用多线程计算
     */
    public static void calculateWithMultiThread() throws InterruptedException {
        long st = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 1;
                for (int i=1; i<count; i++) {
                    a++;
                }
            }
        });
        t1.setName("calculateWithMultiThread");
        t1.start();
        int b = 0;
        for(int i=0; i<count; i--){
            b--;
        }
        long et = System.currentTimeMillis();
        t1.join();
        System.out.println(et-st);
    }

    /**
     * 使用单线程计算
     */
    public static void calculateWithSingleThread(){
        long st = System.currentTimeMillis();
        int a = 1;
        for (int i=1; i<count; i++) {
            a++;
        }
        int b = 0;
        for(int i=0; i<count; i--){
            b--;
        }
        long et = System.currentTimeMillis();
        System.out.println(et-st);
    }

}
