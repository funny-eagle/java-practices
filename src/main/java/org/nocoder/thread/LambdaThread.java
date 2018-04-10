package org.nocoder.thread;

/**
 * @author jason
 * @date 18/4/7.
 */
public class LambdaThread {

    public static void main(String[] args){
        new Thread(() -> {
            for (int i = 0; i <100 ; i++) {
                System.out.print(i + " ");
            }
        }).start();

    }

}
