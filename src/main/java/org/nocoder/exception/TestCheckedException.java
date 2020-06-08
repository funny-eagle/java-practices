package org.nocoder.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * checked exceptions 在编译时会被检查，
 *
 * @author jason
 * @date 2019/6/5.
 */
public class TestCheckedException {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/jason/local/github/java-practices/hello.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (int i = 0; i < 3; i++) {
            System.out.println(bufferedReader.readLine());
        }

        bufferedReader.close();
    }
}
