package org.nocoder.scanner;

import java.util.Scanner;

/**
 * @author yangjl
 * @date 2023/8/9 10:50
 */
public class Scanner01 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("等待输入：");
        while(input.hasNext()){
            System.out.println("输入的值为："+input.next());
        }
    }
}
