package org.example.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

    public static final String CHINESE_PATTERN = "[\\u4e00-\\u9fa5]";

    public static Integer getChineseLength(String chinese) {

        Pattern pattern = Pattern.compile(CHINESE_PATTERN);
        Matcher matcher = pattern.matcher(chinese);

        Integer chineseLength = 0;

        while (matcher.find()) {
            chineseLength++;
        }
        return chineseLength;
    }
}
