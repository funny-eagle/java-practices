package org.nocoder.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.javatpoint.com/java-lambda-expressions
 * @author yangjl
 * @description comparator lambda expression example
 * @date 2022-10-31 14:38
 **/
public class ComparatorExample {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        System.out.println("Sorting on the basis of name...");

        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        for (Product p : list){
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price){
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}