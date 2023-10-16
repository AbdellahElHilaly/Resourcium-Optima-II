package com.youcode.libs.objects;






import com.youcode.utils.app.Config.AppConfig;
import com.youcode.utils.app.Enum.RunMoods;

import java.lang.reflect.Field;
import java.util.List;

public class ObjectHelper {
    public static <T> String[] getModelHeader(T model) {
        Class<?> clazz = model.getClass();
        Field[] fields = clazz.getDeclaredFields();
        String[] headers = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            headers[i] = fields[i].getName();
            if (i==0 && AppConfig.RUN_MOOD.equals(RunMoods.Production.name())) headers[i] = "index";

        }
        return headers;
    }

    public static <T> String[] getModelBody(T model , int index) {
        Class<?> clazz = model.getClass();
        Field[] fields = clazz.getDeclaredFields();
        String[] body = new String[fields.length];
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                Object value = fields[i].get(model);
                body[i] = value != null ? value.toString() : "null";
                //if model have package name get his data like an table body
                if (body[i].contains("com.")) {
                    body[i] = clazz.getSimpleName() + "*object";
                }
                if (i==0 && AppConfig.RUN_MOOD.equals(RunMoods.Production.name())) body[i] = String.valueOf(index);
            } catch (IllegalAccessException e) {
                body[i] = "N/A";
            }
        }









        return body;
    }

    public static <T> String[][] getModelsBody(List<T> models) {
        String[][] body = new String[models.size()][];
        for (int i = 0; i < models.size(); i++) {
            body[i] = getModelBody(models.get(i) , i + 1);
        }
        return body;
    }

    public static String[] handelHeaderToPrint(String[] modelHeader) {
        if (AppConfig.RUN_MOOD.equals(RunMoods.Production.name())) modelHeader[0] = "index";
        return modelHeader;
    }

    public static String[] handelBodyToPrint(String[] modelBody, int i) {
        if (AppConfig.RUN_MOOD.equals(RunMoods.Production.name())) modelBody[0] = String.valueOf(i);
        return modelBody;
    }


}
