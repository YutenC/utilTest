package org.example.MenuId;

import org.example.Util.ListTransfer;

import java.util.List;

public class GenerateStatement {

    public static void main(String[] args) {

        Integer[] intArray = {13145, 13143, 10059, 10061, 10068, 10069, 10052};
        List<Integer> integerList = ListTransfer.toIntegerListWithIntArray(intArray);
        List<String> menuIdList = ListTransfer.toStringList(integerList);
        DeleteMenuId.getDeleteStatements(menuIdList);
    }
}
