package org.nocoder;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class TestJunit {

    List<String> list;

    @BeforeClass
    public static void beforeClass(){
        // 这个方法仅在初始化阶段执行一次
        System.out.println("run before class.");
    }

    @Before
    public void before(){
        System.out.println("run before.");
        list = new ArrayList<>();
        list.add("Jason");
        list.add("Freda");
        list.add("Seven");
    }

    @Test
    public void jasonIsHere(){
        Assert.assertTrue(list.contains("Jason"));
        list.remove("Jason");
        Assert.assertFalse(list.contains("Jason"));
    }

    @Test
    public void jasonIsStillHere(){
        Assert.assertTrue(list.contains("Jason"));
    }

    @After
    public void after(){
        // after 指定的方法在每个测试结束后都执行
        list = null;
        System.out.println("run after.");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("run after class.");
    }
}
