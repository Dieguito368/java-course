package org.dibagon.annotations.example.models;

import org.dibagon.annotations.example.Init;
import org.dibagon.annotations.example.JsonAttribute;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Product {
    @JsonAttribute(capitalize = true)
    private String name;

    @JsonAttribute()
    private long price;

    private LocalDate date;

    @Init
    private void init() {
        this.name = Arrays.stream(name.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
