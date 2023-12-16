package org.example.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;

public class MultimapTest {

    public static void main(String[] args) {

        Multimap<String, String> multimap = ArrayListMultimap.create();

        multimap.put("A", "A1");
        multimap.put("A", "A2");
        multimap.put("A", "A3");
        multimap.put("B", "B1");
        multimap.put("B", "B2");

        Collection<String> list = multimap.get("A");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
