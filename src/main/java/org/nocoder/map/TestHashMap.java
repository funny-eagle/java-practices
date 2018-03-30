package org.nocoder.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 遍历HashMap
 * Created by YANGJINLONG on 2018-3-30.
 */
public class TestHashMap {
    public static void main(String[] args){
        Map<String, Object> map = initMapData();
        iterateMapEntrySet(map);
        iterateMapValues(map);
        iterateMapKeySet(map);
    }

    /**
     *
     * @return
     */
    private static Map<String, Object> initMapData() {
        Map<String, Object> map = new HashMap<String, Object>();
        for(int i=1,j=1;i<=10000 && j<=10000; i++,j++){
            map.put(String.valueOf(i),j);
        }
        System.out.println("map size = " + map.size());
        return map;
    }

    /**
     *  遍历map.keySet(), 获取所有的key，然后通过key获取value
     *  效率低于遍历map.keySet()
     * @param map
     */
    private static void iterateMapKeySet(Map<String, Object> map) {
        long st = System.currentTimeMillis();
        // NO.3 遍历map.keySet()
        System.out.println("遍历map.keySet(), 获取所有的key，然后通过key获取value");
        for(String key : map.keySet()){
            System.out.print("key="+key + ", value=" + map.get(key) + "; ");
        }
        System.out.println();
        long et = System.currentTimeMillis();
        System.out.println(et - st + "ms");
    }

    /**
     * 遍历map.values()， 只能获取所有的value
     * 效率高
     * @param map
     */
    private static void iterateMapValues(Map<String, Object> map) {
        long st = System.currentTimeMillis();
        // NO.2 遍历map.values()
        System.out.println("遍历map.values()， 只能获取所有的value");
        for(Object v : map.values()){
            System.out.print("value=" + v  + "; ");
        }
        System.out.println();
        long et = System.currentTimeMillis();
        System.out.println(et - st + "ms");
    }

    /**
     * 遍历map.entrySet()，获取key和value
     * 效率高于遍历map.entrySet()
     * @param map
     */
    private static void iterateMapEntrySet(Map<String, Object> map) {
        long st = System.currentTimeMillis();
        // NO.1 遍历map.entrySet()
        System.out.println("遍历map.entrySet()，获取key和value");
        for(Map.Entry<String, Object> entry : map.entrySet()){
           System.out.print("key=" + entry.getKey() + ", value=" + entry.getValue()  + "; ");
        }
        System.out.println();
        long et = System.currentTimeMillis();
        System.out.println(et - st + "ms");
    }
}
