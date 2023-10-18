package com.youcode.app.helper;

public class AppHelper {
    public static String filterRoute(String requestURI) {
        return requestURI.substring(requestURI.lastIndexOf("/") + 1);
    }

    public static String capitalize(String route) {
        return route.substring(0, 1).toUpperCase() + route.substring(1);
    }

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
