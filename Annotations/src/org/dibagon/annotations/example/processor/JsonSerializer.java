package org.dibagon.annotations.example.processor;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.dibagon.annotations.example.Init;
import org.dibagon.annotations.example.JsonAttribute;

public class JsonSerializer {
    public static void initializeObject(Object object) {
        if (Objects.isNull(object)) {
            throw new RuntimeException("The object to be serialized cannot be null");
        }

        Method[] methods = object.getClass().getDeclaredMethods();

        Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(Init.class))
                .forEach(method -> {
                    method.setAccessible(true);

                    try {
                        method.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException("Error initializing object: " + e.getMessage());
                    }
                });
    }

    public static String convertJson(Object object) {
        if (Objects.isNull(object)) {
            throw new RuntimeException("The object to be serialized cannot be null");
        }

        initializeObject(object);

        Field[] attributes = object.getClass().getDeclaredFields();

        return Arrays.stream(attributes)
                .filter(field -> field.isAnnotationPresent(JsonAttribute.class))
                .map(field -> {
                    field.setAccessible(true);
                    String key = field.getAnnotation(JsonAttribute.class).key().isEmpty()
                            ? field.getName()
                            : field.getAnnotation(JsonAttribute.class).key();

                    try {
                        Object value = field.get(object);

                        if (field.getAnnotation(JsonAttribute.class).capitalize() && value instanceof String) {
                            String newValue = (String) value;
                            // newValue = newValue.substring(0, 1).toUpperCase() + newValue.substring(1);
                            newValue = Arrays.stream(newValue.split(" "))
                                    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));

                            field.set(object, newValue);
                        }

                        return "\"" + key + "\":\"" + field.get(object) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error serializing JSON: " + e.getMessage());
                    }
                })
                .reduce("{", (a, b) -> {
                    if ("{".equals(a)) {
                        return a + b;
                    }

                    return a + ", " + b;
                })
                .concat("}");
    }
}
