package org.nocoder.io;

import org.apache.commons.io.IOUtils;
import java.io.*;
import java.util.List;

/**
 * @author jason
 * @date 18/5/6.
 */
public class CommonsIoTest {
    public static void main(String[] args) {
        File file = new File("src/main/resources/小猪佩奇.txt");
        try {
            // 读取文件所有行的内容
            List<String> list = IOUtils.readLines(new FileInputStream(file), "UTF-8");
            System.out.println("文件行数：" + list.size());
            System.out.println("文件内容：" + list);
            // 写出到文件
            IOUtils.write("\n使用IOUtils.write()方法写出到文件", new FileOutputStream(file, true), "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
