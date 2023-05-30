package org.nocoder;

import org.junit.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TestJunit {

    List<String> list;

    @BeforeClass
    public static void beforeClass() {
        // 这个方法仅在初始化阶段执行一次
        System.out.println("run before class.");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("run after class.");
    }

    @Before
    public void before() {
        System.out.println("run before.");
        list = new ArrayList<>();
        list.add("Jason");
        list.add("Freda");
        list.add("Seven");
    }

    @Test
    public void jasonIsHere() {
        Assert.assertTrue(list.contains("Jason"));
        list.remove("Jason");
        Assert.assertFalse(list.contains("Jason"));
    }

    @Test
    public void jasonIsStillHere() {
        Assert.assertTrue(list.contains("Jason"));
    }

    @After
    public void after() {
        // after 指定的方法在每个测试结束后都执行
        list = null;
        System.out.println("run after.");
    }

    @Test
    public void tes(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH,17);
        calendar.set(Calendar.HOUR_OF_DAY,16);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR, 1);
        System.out.println(calendar.getTime());


//        Date start = new Date(2023,3,23,16,20,20);
//        Date end = new Date(2023,3,23,16,20,30);
//        System.out.println(start.after(end));
//        System.out.println(start.before(end));
    }
}
