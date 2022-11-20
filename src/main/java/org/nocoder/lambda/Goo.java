package org.nocoder.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *  使用lambda使用已有的接口
 */
public class Goo {
    public static void main(String[] args) {

    }

    // 非lambda写法
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Action from " + e.getSource());
        }
    };

    // lambda 写法
    ActionListener listener2 = (e) -> System.out.println("Action from " + e.getSource());


}
