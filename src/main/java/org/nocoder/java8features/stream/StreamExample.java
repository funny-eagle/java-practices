package org.nocoder.java8features.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        // sequential stream
        Stream<Integer> sequentialStream = list.stream();
        Stream<Integer> highNumsSeq = sequentialStream.filter( s -> s > 90);
        highNumsSeq.forEach(s -> System.out.println("High Nums sequential = "+s));

        // parallel stream 不按顺序处理值，适合数据量较大的集合
        Stream<Integer> parallelStream = list.parallelStream();
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        highNums.forEach(s -> System.out.println("High Nums parallel=" + s));

        System.out.println("sum Stream:" + sumStream(list));

    }

    private static int sumStream(List<Integer> list){
        return list.stream().filter(n -> n > 10).mapToInt(i -> i).sum();
    }
}
