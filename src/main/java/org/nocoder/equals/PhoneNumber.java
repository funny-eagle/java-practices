package org.nocoder.equals;

import java.util.HashMap;
import java.util.Objects;

/**
 * 重写了equals()方法则必须要重写hashcode()方法
 */
public class PhoneNumber {

    private int prefix;
    private int number;
    public PhoneNumber(int prefix, int number) {
        this.prefix = prefix;
        this.number = number;
    }

    /**
     * 测试方法以phoneNumber作为map的key，如果不重写hashcode方法，则结果返回为null；
     * 重写hashcode方法后，结果返回为 Jason
     *
     * @param args
     */
    public static void main(String[] args) {
        HashMap<PhoneNumber, String> map = new HashMap<>(100);
        map.put(new PhoneNumber(021, 80888088), "Jason");
        System.out.println(map.get(new PhoneNumber(021, 80888088)));
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PhoneNumber that = (PhoneNumber) o;
        return prefix == that.prefix && number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, number);
    }
}
