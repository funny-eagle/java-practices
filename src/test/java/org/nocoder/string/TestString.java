package org.nocoder.string;

import org.junit.Test;

import java.util.StringTokenizer;

public class TestString {

    @Test
    public void test_string_tokenizer() {
        StringTokenizer st = new StringTokenizer("I am a Chinese man.");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    @Test
    public void test_string_tokenizer_element() {
        StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ", |");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }

    @Test
    public void test_string_tokenizer_element_and_tag() {
        // 输出分隔符
        StringTokenizer st = new StringTokenizer("Hello, World|of|Java", ", |", true);
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
