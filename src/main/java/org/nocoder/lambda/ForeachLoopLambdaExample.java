package org.nocoder.lambda;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangjl
 * @description foreach loop
 * @date 2022-10-31 11:27
 **/
public class ForeachLoopLambdaExample {


    public static void main(String[] args) {
        listForeach();
    }

    private static void listForeach() {
        List<String> list = new ArrayList<>();
        list.add("Jason");
        list.add("Funny");
        list.add("Seven");

        list.forEach((n)->{
            System.out.println(n);
        });
        list.forEach(System.out::println);
    }
}