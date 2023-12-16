package org.example.Example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();


        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);


        // entrySet() 遍歷Map中的所有KEY-VALUE
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("KEY: " + key + ", VALUE: " + value);
        }
        System.out.println("=================");

        // keySet()回傳一個Set
        for (String key : map.keySet()) {
            System.out.print("KEY: " + key + " ");
        }
        System.out.println("=================");

        // values()回傳一個Collection
        for (Integer value : map.values()) {
            System.out.print("VALUE: " + value + " ");
        }
        System.out.println("=================");

        // 用keySet 回傳Set後，再用Iterator跑迴圈
        Set<String> key = map.keySet();
        Iterator<String> iterator = key.iterator();
        while (iterator.hasNext()) {
            String mapKey = iterator.next();
            System.out.print("KEY: " + mapKey + " ");
        }

    }
}