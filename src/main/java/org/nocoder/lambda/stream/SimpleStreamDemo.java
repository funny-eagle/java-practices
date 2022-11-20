package org.nocoder.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamDemo {
    static class Hero {
        public Hero(String name, int age) {
            this.name = name;
            this.age = age;
        }

        String name;
        int age;
    }

    static Hero[] heroes = {
            new Hero("Jack", 16),
            new Hero("Steam", 20),
            new Hero("Guild", 30),
            new Hero("Jone", 40),
            new Hero("Marry", 50)
    };

    public static void main(String[] args) {
        long adultYearExperience = Arrays.stream(heroes)
                .filter(h -> h.age >= 18)
                .mapToInt(h -> h.age).sum();
        System.out.println(adultYearExperience);

        List<Object> sorted = Arrays.stream(heroes)
                .sorted((h1, h2) -> h1.name.compareTo(h2.name))
                .map(h -> h.name)
                .collect(Collectors.toList());
        System.out.println("Heroes by name: "+sorted);
    }


}
