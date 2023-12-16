package org.example.Util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomStringUtil {

    private static final String POOL = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String getRandomString() {
        StringBuilder traceId = new StringBuilder();
        char element;

        for (int i = 0; i < 16; i++) {
            element = POOL.charAt((int) (Math.random() * POOL.length()));
            traceId.append(element);
        }

        return traceId.toString();
    }

}
