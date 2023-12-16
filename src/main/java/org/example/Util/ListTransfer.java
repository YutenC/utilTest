package org.example.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTransfer {

    public static List<String> toStringList(List<Integer> integerList) {
        List<String> stringList = new ArrayList<>();
        integerList.forEach(element -> stringList.add(element.toString()));
        return stringList;
    }

    public static List<Integer> toIntegerListWithIntArray(Integer[] intArrays) {
        return new ArrayList<>(Arrays.asList(intArrays));
    }
}
