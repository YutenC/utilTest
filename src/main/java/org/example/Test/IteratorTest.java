package org.example.Test;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<String> stringList = Lists.newArrayList();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("E");
        stringList.add("F");

        List<String> stringList2 = Lists.newArrayList();
        stringList2.add("B");
        stringList2.add("D");
        stringList2.add("E");



//        Iterator<String> iterator = stringList.iterator();
//        while (iterator.hasNext()) {
//            String deleteString = iterator.next();
//            if (stringList2.contains(deleteString)) {
//                iterator.remove();
//            }
//        }

//        lambda寫法如下

        stringList.removeIf(stringList2::contains);

        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
