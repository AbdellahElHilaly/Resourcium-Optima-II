package com.youcode.libs.print;



import com.youcode.libs.objects.ObjectHelper;

import java.lang.reflect.Field;
import java.util.List;


public class ObjectPrinter extends Printer {

    private static int[] maxSizes;
    private static String[] headers;
    private static String[] body;
    private static String[][] bodies;

    private static void generateMaxFiledSize(String[] headers, String[] body) {
        maxSizes = new int[headers.length];
        for (int i = 0; i < headers.length; i++) {
            maxSizes[i] = headers[i].length();
        }

        for (int i = 0; i < body.length; i++) {
            if (body[i].length() > maxSizes[i]) {
                maxSizes[i] = body[i].length();
            }
        }

    }


    private static <T> void generateGlobalMaxFiledSize(List<T> models) {
        if (models.isEmpty()) {
            return;
        }
        maxSizes = new int[ObjectHelper.getModelHeader(models.get(0)).length];
        String[] headers = ObjectHelper.getModelHeader(models.get(0));
        for (int i = 0; i < headers.length; i++) {
            if (headers[i].length() > maxSizes[i]) {
                maxSizes[i] = headers[i].length();
            }
        }
        int k = 1;
        for (T model : models) {
            String[] body = ObjectHelper.getModelBody(model, k++);
            for (int i = 0; i < body.length; i++) {
                if (body[i].length() > maxSizes[i]) {
                    maxSizes[i] = body[i].length();
                }
            }
        }
    }


    private static void printVCases(String color) {
        tempColor = color;
        print("|");
        printSpace(1);
    }

    private static void printHCase(String[] headers, String[] body, String color, String symbol) {
        tempColor = color;
        int realSpace;
        int add = 3;
        for (int i = 0; i < headers.length; i++) {
            realSpace = maxSizes[i] + add;
            for (int j = 0; j < realSpace; j++) {
                print(symbol);
            }
        }
        print(symbol);
        endl(1);
    }


    public static void printField(String key, String value) {
        System.out.print("  ");
        printKeyVal(key, value);
    }

    public static <T> void json(T object, String objectName) {
        if (isNull(object)) return;

        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        System.out.println(objectName + " : {");

        for (Field field : fields) {
            field.setAccessible(true);

            String fieldName = field.getName();
            String fieldValue;

            try {
                Object value = field.get(object);
                fieldValue = value != null ? value.toString() : "null";
            } catch (IllegalAccessException e) {
                fieldValue = "N/A";
            }

            printField(fieldName, fieldValue);
        }

        System.out.println("}");
    }

    private static <T> boolean isNull(T object) {
        if (object != null) return false;
        error("Object is null , can't print it !");
        return true;
    }

    public static <T> void jsonList(List<T> objects, String objectName) {
        System.out.println("-------------------------------start list-------------------------------------");
        for (T object : objects) {
            json(object, objectName);
        }
        System.out.println("-------------------------------end list---------------------------------------");
    }


    private static void printTableHeader(String[] headers, String[] body) {
        printHCase(headers, body, "yellow", "=");
        int realSize;

        for (int i = 0; i < headers.length; i++) {
            if (i >= 1) printSpace(1);
            printVCases("yellow");
            tempColor = "cyan";
            print(headers[i]);
            realSize = maxSizes[i] - headers[i].length();
            if (i >= 1) printSpace(realSize);
            if (i == headers.length - 1) printSpace(1);
        }

        printVCases("yellow");
        endl(1);
        printHCase(headers, body, "yellow", "=");


    }


    private static void printTableBody(String[] headers, String[] body) {
        int realSize;

        for (int i = 0; i < headers.length; i++) {

            if (i >= 1) printSpace(1);
            printVCases("green");

            tempColor = "white";
            print(body[i]);
            realSize = maxSizes[i] - body[i].length();
            printSpace(realSize);
            if (i == headers.length - 1) printSpace(1);
        }


        printVCases("green");
        endl(1);
        printHCase(headers, body, "green", "-");
    }


    public static <T> void table(T model, String title) {

        headers = ObjectHelper.handelHeaderToPrint(ObjectHelper.getModelHeader(model));
        body = ObjectHelper.handelBodyToPrint(ObjectHelper.getModelBody(model, 1), 1);
        generateMaxFiledSize(headers, body);

        drawTitleStar(title);
        drawTableStart(model);


    }

    private static void drawTitleStar(String title) {
        tempColor = "yellow";
        print(title);
        endl(1);

    }


    private static <T> void drawTableStart(T model) {
        printTableHeader(headers, body);
        printTableBody(headers, body);
    }

    public static <T> void tableList(List<T> models , String title) {
        if (models.isEmpty())  return;

        headers = ObjectHelper.getModelHeader(models.get(0));
        bodies = ObjectHelper.getModelsBody(models);
        generateGlobalMaxFiledSize(models);

        drawTitleStar(title);

        printTableHeader(headers, ObjectHelper.getModelBody(models.get(0), 1));
        for (String[] body : bodies) {
            printTableBody(headers, body);
        }

    }

}
