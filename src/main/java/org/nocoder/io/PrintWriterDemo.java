package org.nocoder.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {


    public static void main(String[] args) {
        PrintWriter output;
        try {
            output = new PrintWriter("temp.txt");
            output.print("Hello, PrintWriter");
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
