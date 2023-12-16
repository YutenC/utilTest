package org.example.Example;

public class NullExample {

    public static void main(String[] args) {
        Object nullObject = null;

        System.out.println(nullObject);
//        System.out.println(nullObject.getClass());
//        無法取得null 的型別，因為 null 代表著空無一物，沒有這個物件

//        String nullString = nullObject.toString();
//        System.out.println(nullString);
//        無法將null用toString()，因為toString()是將物件轉成String，但是null表示沒有這個物件

        System.out.println((String) nullObject);
//        將null型別寫成String，會產生"null"的字串，與其他方式不同
    }
}
