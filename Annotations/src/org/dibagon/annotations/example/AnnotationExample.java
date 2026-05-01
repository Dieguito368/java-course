package org.dibagon.annotations.example;

import org.dibagon.annotations.example.models.Product;
import org.dibagon.annotations.example.processor.JsonSerializer;

import java.time.LocalDate;

public class AnnotationExample {
    public static void main(String[] args) {
        Product p = new Product();
        p.setName("Wireless mechanical keyboard");
        p.setPrice(1200);
        p.setDate(LocalDate.now());

        System.out.println(JsonSerializer.convertJson(p));
    }
}