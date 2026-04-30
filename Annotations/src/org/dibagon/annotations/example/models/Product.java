package org.dibagon.annotations.example.models;

import org.dibagon.annotations.example.JsonAttribute;

import java.time.LocalDate;

public class Product {
    @JsonAttribute()
    private String name;

    @JsonAttribute()
    private long price;

    private LocalDate date;

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
