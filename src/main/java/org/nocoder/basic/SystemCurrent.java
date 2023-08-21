package org.nocoder.basic;

/**
 * @author yangjl
 * @date 2023/8/21 10:30
 */
public class SystemCurrent {

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        Thread.sleep(3600000);
        long end = System.currentTimeMillis();
        System.out.println(end -start);

    }
}
