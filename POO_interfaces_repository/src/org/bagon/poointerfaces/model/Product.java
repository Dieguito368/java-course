package org.bagon.poointerfaces.model;

public class Product extends EntityBase {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nPrice: " + price;
    }
}
