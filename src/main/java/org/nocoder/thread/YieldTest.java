package org.nocoder.thread;

/**
 * @author jason
 * @date 18/4/6.
 */
public class YieldTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int j = 11; j <= 20; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
