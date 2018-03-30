package org.nocoder.basic;

import java.io.*;

/**
 * @author yangjinlong
 */
public class StreamTest {

    public static void main(String[] args){
        /*
            InputStreamReader
            BufferedReader
            Writer
            PipedInputStream
        */
        testInputStream();
    }

    /**
     * 使用InputStreamReader类读取文件中的内容
     */
    public static void testInputStream(){
        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("note.txt"), "UTF8");
            try {
                System.out.println(isr.getEncoding());
                char [] chars = new char[1024];
                int length = isr.read(chars);
                System.out.println(new String(chars, 0, length));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 使用BufferedReader读取控制台输入的内容
     */
    public static void testBufferedReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("随便输入点什么吧...");
        try {
            String str = reader.readLine();
            System.out.println("您输入了 " + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
