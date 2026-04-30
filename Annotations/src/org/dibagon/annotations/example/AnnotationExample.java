package org.dibagon.annotations.example;

import org.dibagon.annotations.example.models.Product;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class AnnotationExample {
    public static void main(String[] args) throws NoSuchFieldException {
        Product p = new Product();
        p.setName("Wireless mechanical keyboard");
        p.setPrice(1200);
        p.setDate(LocalDate.now());

        Field[] attributes = p.getClass().getDeclaredFields();

        String json = Arrays.stream(attributes)
                .filter(field -> field.isAnnotationPresent(JsonAttribute.class))
                .map(field -> {
                    field.setAccessible(true);
                    String key = field.getAnnotation(JsonAttribute.class).key().isEmpty()
                            ? field.getName()
                            : field.getAnnotation(JsonAttribute.class).key();

                    try {
                        System.out.println("\"" + key + "\":\"" + field.get(p) + "\"");
                        return "\"" + key + "\":\"" + field.get(p) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException("Error serializing JSON: " + e.getMessage());
                    }
                })
                .reduce("{", (a, b) -> {
                    if("{".equals(a)) {
                        return a + b;
                    }

                    return a + ", " + b;
                })
                .concat("}");

        System.out.println(json);
    }
}