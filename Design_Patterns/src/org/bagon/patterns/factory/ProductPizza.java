package org.bagon.patterns.factory;

import java.util.List;
import java.util.ArrayList;

public abstract class ProductPizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> ingredients;

    public ProductPizza() {
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;

    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Selecting the dough " + dough);
        System.out.println("Adding the sauce " + dough);
        System.out.println("Adding the ingredients: ");
        ingredients.forEach(System.out::println);
    }

    abstract public void cook();

    abstract public void cut();

    public void packUp() {
        System.out.println("Placing the pizza in a packaging box");
    }

    @Override
    public String toString() {
        return "ProductPizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
