package org.gonzalez.invoicesapp.models;

public class Product {
    private int code;
    private String name;
    private double price;
    private static int lastCode;

    public Product() {
        this.code = ++lastCode;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
