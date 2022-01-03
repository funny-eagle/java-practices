package org.nocoder.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) {
        // 从内存写出到文件
        try (FileOutputStream outputStream = new FileOutputStream("temp.dat")) {
            for (int i = 0; i < 10; i++) {
                outputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件读入到内存
        try (FileInputStream inputStream = new FileInputStream("temp.dat")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
