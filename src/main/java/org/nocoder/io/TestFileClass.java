package org.nocoder.io;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("image/helli.gif");
        System.out.println("is exists? " +file.exists());
        System.out.println("length: " + file.length());
        System.out.println("can read ? "+file.canRead());
        System.out.println("is file? "+file.isFile());
        System.out.println("is directory? "+ file.isDirectory());
        System.out.println("can execute? "+file.canExecute());
        System.out.println("is absolute? "+ file.isAbsolute());
        System.out.println("is hidden? "+ file.isHidden());
        System.out.println("absolute path: "+ file.getAbsolutePath());
        System.out.println("last modified:"+ file.lastModified());
    }
}
