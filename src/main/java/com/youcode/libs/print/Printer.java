package com.youcode.libs.print;

import java.nio.file.Path;

public class Printer extends Colors {
    protected String message;
    protected final static String space = " ";
    protected final static String line = "----------------------------------------";


    public static void info(String message) {

        Colors.tempColor = "blue";
        Emojis.tempEmoji = "info";
        Emojis.tempStatus = "info";

        showMassage(message, Emojis.tempStatus);
    }


    public static void warning(String message) {
        Colors.tempColor = "yellow";
        Emojis.tempEmoji = "warning";
        Emojis.tempStatus = "warning";

        showMassage(message, Emojis.tempStatus);

    }

    public static void error(String message) {
        Colors.tempColor = "red";
        Emojis.tempEmoji = "error";
        Emojis.tempStatus = "error";

        showMassage(message, Emojis.tempStatus);
    }

    public static void success(String message) {
        Colors.tempColor = "green";
        Emojis.tempEmoji = "success";
        Emojis.tempStatus = "success";

        showMassage(message, Emojis.tempStatus);
    }


    public static void showMassage(String message, String status) {
        line();
        print(Emojis.emoji.get(Emojis.tempEmoji));
        print(status);
        print(Emojis.emoji.get(Emojis.tempEmoji));
        lineEnd();
        print(space + message);
        System.out.println();
    }

    public static void set(String message) {
        Colors.tempColor = "reset";
        print(message + ": ");
        endl(1);
    }

    public static <T> void printKeyVal(T key, String val) {
        Colors.tempColor = "yellow";
        print(key + " : ");
        Colors.tempColor = "cyan";
        print(val);
        endl(1);
    }


    public static void line() {
        System.out.print(Colors.colorsCode.get(Colors.tempColor) + line + Colors.colorsCode.get("reset"));
    }

    public static void lineEnd() {
        System.out.println(Colors.colorsCode.get(Colors.tempColor) + line + Colors.colorsCode.get("reset"));
    }

    public static <T> void print(T message) {
        System.out.print(Colors.colorsCode.get(Colors.tempColor) + message + Colors.colorsCode.get("reset"));
    }


    public static void endl(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println();
        }
    }


    public static void printSpace(int i) {
        for (int j = 0; j < i; j++) {
            print(space);
        }
    }


    public static <C , T> void debug(Class<C> Clazz, T message) {
        printPath(Clazz);
        endl(1);
        printDebug(message);
    }
    public static <T> void debug(T message) {
        printDebug(message);
    }

    private static <C> void printPath(Class<C> clazz) {
        Colors.tempColor = "cyan";
        print(clazz.getName());
        print(" : ");
    }

    private static <T> void printDebug(T message) {
        Colors.tempColor = "purple";
        print(message);
        endl(1);
    }

    public static void url(String filePath) {
        Colors.tempColor = "cyan";
        print(space + filePath);
        endl(1);
    }


}

