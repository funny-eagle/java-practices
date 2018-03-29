package org.nocoder.basic;

/**
 * Created by YANGJINLONG on 2018-3-29.
 */
public class FormatString {
    public static void main(String[] args){
        int number = 99;
        // 不足4为的补0
        System.out.println(String.format("%04d", number));
    }
}
