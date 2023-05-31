package org.nocoder.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author yangjl
 * @date 2023-05-23
 */
public class DoubleColon {
    private String id;
    private String name;

    public DoubleColon() {
    }

    public DoubleColon(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoubleColon{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        DoubleColon d = new DoubleColon();
        d.test1();
        d.test2();
        d.test3();
        d.test4();
        d.test5();
    }

    /**
     * 使用场景1:引用静态方法
     */
    public void test1() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.forEach(DoubleColon::print);
        // 等同于以下代码
        //list.forEach(s -> DoubleColon.print(s));
    }

    /**
     * 使用场景2: 引用特定对象实例方法
     */
    public void test2() {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.forEach(new DoubleColon()::print2);
        // 等同于以下代码
        //list.forEach(s -> new DoubleColon().print2(s));
    }

    /**
     * 使用场景3：引用特定类型的任意对象的实例方法
     */
    public void test3() {
        String[] arr = {"bbbb", "aaaa", "eeee", "dddd", "cccc"};
        Arrays.sort(arr, String::compareToIgnoreCase);
        // 等同于以下代码
        //Arrays.sort(arr, (a, b) -> a.compareToIgnoreCase(b));

        for (String s : arr) {
            System.out.println(s);
        }
    }

    // 使用场景4:引用类构造方法
    public void test4() {
        // 不需要实现 Colon 和 ColonWithParams 接口
        Colon colon = DoubleColon::new;
        DoubleColon dc = colon.createDoubleColon();
        System.out.println(dc);

        ColonWithParams colonWithParams = DoubleColon::new;
        DoubleColon dc2 = colonWithParams.createDoubleColon("1", "Jason");
        System.out.println(dc2);
    }

    /**
     * 使用场景5:引用数组构造方法
     *
     * 使用@FunctionalInterface自定义函数式接口来实现
     *
     */
    public void test5(){
        MyArrayFunction<Integer, DoubleColon[]> function = DoubleColon[]::new;
        DoubleColon[] arr = function.apply(5);

        for (DoubleColon doubleColon : arr) {
            System.out.println(doubleColon);
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public void print2(String str) {
        System.out.println(str);
    }
}

/**
 * 自定义函数式接口
 * @param <A>
 * @param <T>
 */
@FunctionalInterface
interface MyArrayFunction<A, T>{
    T apply(A a);
}

class ChildDoubleColon extends DoubleColon {
    /**
     * 使用场景6:引用父类实例方法
     */
    public void test() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.forEach(super::print2);
    }

    public static void main(String[] args) {
        ChildDoubleColon c = new ChildDoubleColon();
        c.test4();
    }
}

interface Colon {
    DoubleColon createDoubleColon();
}

interface ColonWithParams {
    DoubleColon createDoubleColon(String id, String name);
}


