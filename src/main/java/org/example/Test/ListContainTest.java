package org.example.Test;

import com.google.common.collect.Lists;

import java.util.List;

public class ListContainTest {

    public static void main(String[] args) {

        List<String> mainList = Lists.newArrayList();
        mainList.add("String");
        mainList.add("Math");
        mainList.add("EEE");
        mainList.add("AAA");

        List<String> secondList = Lists.newArrayList();
        secondList.add("String");
        secondList.add("Math");
        secondList.add("AE");

        for (String str : secondList) {
           if (mainList.contains(str)) {
               System.out.println("true");
           } else System.out.println("false");
        }
    }
}
