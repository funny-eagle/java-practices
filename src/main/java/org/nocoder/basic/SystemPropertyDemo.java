package org.nocoder.basic;

import java.util.Properties;

/**
 * SystemPropertyDemo
 * @author Yang
 */
public class SystemPropertyDemo {
    public static void main(String[] args) {

        SystemPropertyDemo demo = new SystemPropertyDemo();
        System.out.println("Current Java version: " + demo.getSystemProperty("java.specification.version"));
        System.out.println("java.runtime.version:" + demo.getSystemProperty("java.runtime.version"));

        // print all properties
        System.getProperties().list(System.out);
    }

    /**
     * getSystemProperty
     *
     * @param key
     * @return
     */
    public String getSystemProperty(String key) {
        return System.getProperty(key);
    }

    /**
     * use System.getProperties().list(System.out) instead
     */
    @Deprecated()
    public void printAllProperties() {
        Properties properties = System.getProperties();
        properties.forEach((Object k, Object v) -> {
            System.out.println(k + ": " + v);
        });
    }
}
