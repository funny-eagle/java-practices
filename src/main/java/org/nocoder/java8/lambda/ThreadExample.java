package org.nocoder.java8.lambda;

/**
 * creating thread with lambda expression
 * https://www.javatpoint.com/java-lambda-expressions
 *
 * @author yangjl
 * @description creating thread with lambda expression
 * @date 2022-10-31 14:26
 **/
public class ThreadExample {
    public static void main(String[] args) {
        createThreadWithoutLambda();
    }

    private static void createThreadWithoutLambda() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };

        Thread t1 = new Thread(r1);
        t1.start();
    }

    private static void createThreadWithLambda() {
        Runnable r2 = () -> System.out.println("Thread2 is running...");

        Thread t2 = new Thread(r2);
        t2.start();
    }
}
