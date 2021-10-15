package org.nocoder.string;

/**
 * SubString Demo
 */
public class SubStringDemo {
    /**
     * substring()方法构造一个新的字符串对象，它是给定字符串的一部分，或者称作某个字符串的子字串
     * substring()需要一个开始索引，字符在字符串中的索引是从0开始的
     *
     * @param args
     */
    public static void main(String[] args) {
        String a = "Java is great.";
        System.out.println(a);

        // 一个参数的substring()方法返回从startIndex到结尾的字符串
        String b = a.substring(5);
        // b 为字符串is great，
        System.out.println(b);

        // 两个参数的substring()方法，返回从startIndex到endIndex的字符串，半开区间，包含开始，不含结尾
        String c = a.substring(5, 7);
        // c 为字符串is
        System.out.println(c);

        String d = a.substring(5);
        System.out.println(d);
    }
}
