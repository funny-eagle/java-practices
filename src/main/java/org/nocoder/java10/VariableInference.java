package org.nocoder.java10;

import java.awt.print.Book;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.function.Function;

public class VariableInference {

    public static void main(String[] args) {
        // 简单类型推导
        var value = 1;
        System.out.println(value);

        var list = new ArrayList<String>();

        // 返回值类型推导
        var name = getName();
        System.out.println(name);

        {
            String message = "Hello, this is a message...";
            StringReader reader = new StringReader(message);
            StreamTokenizer tokenizer = new StreamTokenizer(reader);
        }


        {
            // 当类名比较长的时候，原来声明类型的写法显得代码十分冗长，用变量推导的写法可以减少代码长度，便于阅读
            var message = "Hello, this is a message...";
            var reader = new StringReader(message);
            var tokenizer = new StreamTokenizer(reader);
        }

        // 问题1、当使用返回值类型推导时，我们就需要猜测返回类型。当然使用IDE的时候，可以借助IDE的功能查看方法返回值类型
        var result = getResult();

        // 问题2、var 不能与lambda结合使用
        {
            String message = "Hello";
            Function<String, String> quotify = m -> "'" + message + "'";
            // Cannot infer type: lambda expression requires an explicit target type
            // var quotifyFunction = m -> "'" + message + "'";
        }

        // 问题3、var 与<>结合使用时，会推断为Object类型，需要我们在<>中指定类型
        var books = new ArrayList<>();
        var books1 = new ArrayList<Book>();

    }

    private static String getName() {
        return "YangJinlong";
    }

    private static String getResult() {
        return "result";
    }
}

