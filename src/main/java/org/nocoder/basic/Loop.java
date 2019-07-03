package org.nocoder.basic;

/**
 * @author jason
 * @date 18/3/31.
 */
public class Loop {
    public static void main(String[] args){
        int count = 0;
        for(int i = 0; i<10; i++){
            for(int j=0; j<i; j++) {
                System.out.println(i * j);
                count++;
            }
        }
        System.out.println("count="+count);
    }
}
