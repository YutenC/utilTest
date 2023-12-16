package org.example.MD5;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

    public static String transToMD5(String str) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            byte[] digest = md5.digest(str.getBytes(StandardCharsets.UTF_8));
            // 將雜湊值轉換為 16 進制字符串。
            String hash = new BigInteger(1, digest).toString(16);
            // 在前面填充 0，使字符串長度為 16。
            while (hash.length() < 16) {
                hash = "0" + hash;
            }
            return hash;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
