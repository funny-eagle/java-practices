package org.nocoder.java8.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 * Java 8 中的 Stream 是对集合（Collection）对象功能的增强，
 * 它专注于对集合对象进行各种非常便利、高效的聚合操作（aggregate operation），或者大批量数据操作 (bulk data operation)。
 * Stream API 借助于同样新出现的 Lambda 表达式，极大的提高编程效率和程序可读性。
 * 同时它提供串行和并行两种模式进行汇聚操作，并发模式能够充分利用多核处理器的优势，
 * 使用 fork/join 并行方式来拆分任务和加速处理过程。通常编写并行代码很难而且容易出错,
 * 但使用 Stream API 无需编写一行多线程的代码，就可以很方便地写出高性能的并发程序。
 * 所以说，Java 8 中首次出现的 java.util.stream 是一个函数式语言+多核时代综合影响的产物。
 */
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







    class State {
        Date startDate;
        Date endDate;

        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getEndDate() {
            return endDate;
        }

        public void setEndDate(Date endDate) {
            this.endDate = endDate;
        }
    }
}
