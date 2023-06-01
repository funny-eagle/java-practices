package org.nocoder.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class FilePath {
    public static void main(String[] args) throws IOException, URISyntaxException {
        File file = new File("/Users/yangjl/local/test.txt");
        printPaths(file);

        // relative path
        file = new File("test2.txt");
        printPaths(file);

        // complex relative paths
        file = new File("/Users/yangjl/..yangjl/test3.txt");
        printPaths(file);

        // URI paths
        file = new File(new URI("file://Users/yangjl/test.txt"));
        printPaths(file);
    }

    private static void printPaths(File file) throws IOException {
        System.out.println("absolute path:" + file.getAbsolutePath());
        System.out.println("canonical path:" + file.getCanonicalPath());
        System.out.println("Path:" + file.getPath());
    }
}
