package org.nocoder.generics;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 */
public class Generics {
    public static void main(String[] args) {
        Pair<String, Object> p1 = new Pair<>("a", 1);
        Pair<String, Object> p2 = new Pair<>("b", "a");

        Util.compare(p1, p2);

        List<String> list = getList("1", 2);
        List<Integer> list2 = getList("3", 4);

    }

    public static <T> List<T> getList(String a, Integer i) {
        List<T> list = new ArrayList<>();
        list.add((T) a);
        list.add((T) i);
        return list;
    }

    public static <T> String getString(Class<T> clazz, String s) {

        return clazz.getName();
    }

    public static <T> List<T> importExcel(InputStream inputStream, Class<T> clazz){
        List<T> list = new ArrayList<>();
        try {
            T t = clazz.newInstance();
            list.add(t);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return list;
    }

}


class Container<E> {
    public Container() {
    }

    public void push(E e) {
    }

    public E pop() {
        return null;
    }


    public List<E> hello() {
        return null;
    }

}

class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}