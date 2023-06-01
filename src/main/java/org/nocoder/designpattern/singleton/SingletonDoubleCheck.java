package org.nocoder.designpattern.singleton;

/**
 * 用双重检查加锁，实现线程安全的单例模式
 */
public class SingletonDoubleCheck {
    // volatile 禁止指令重排
    private volatile static SingletonDoubleCheck INSTANCE;

    private SingletonDoubleCheck() {

    }

    public static SingletonDoubleCheck getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

}
