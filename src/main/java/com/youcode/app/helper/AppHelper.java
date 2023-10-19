package com.youcode.app.helper;

import java.util.List;

public class AppHelper {

    public static String toCamelCase(String input) {
        String[] words = input.split("-");
        StringBuilder result = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            result.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase());
        }

        return result.toString();
    }
}
