package org.nocoder.thread;

public class JConsoleTest {

    public static void createLoopThread(){
        Thread t1 = new Thread(()->{
           while(true);
        }, "test-loop-thread");
        t1.start();
    }

    public static void createLockThread(final Object lock){
        Thread t2 = new Thread(()->{
            System.out.println("t2 created");
            synchronized(lock){
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "test-lock-thread");
        t2.start();
    }

    static class SyncAdd implements Runnable{

        Integer a;
        Integer b;

        public SyncAdd(Integer a, Integer b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (a){
                synchronized (b){
                    System.out.println( a + b);
                }
            }
        }
    }

    static class SyncString implements Runnable{
        String a;
        String b;

        public SyncString(String a, String b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " start");
            synchronized (a){
                System.out.println(Thread.currentThread().getName()+" get lock a " + a.hashCode());
                synchronized (b){
                    System.out.println(Thread.currentThread().getName()+" get lock b " + b.hashCode());
                    System.out.println(Thread.currentThread().getName() + " result: " + a + b);
                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(new SyncString("a", "b")).start();
            new Thread(new SyncString("b", "a")).start();
        }
        //JConsoleTest.createLoopThread();
        //JConsoleTest.createLockThread("a");
    }
}
