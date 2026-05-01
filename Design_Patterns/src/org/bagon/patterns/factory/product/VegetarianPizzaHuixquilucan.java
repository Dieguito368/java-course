package org.bagon.patterns.factory.product;

import org.bagon.patterns.factory.ProductPizza;

public class VegetarianPizzaHuixquilucan extends ProductPizza {
    public VegetarianPizzaHuixquilucan() {
        super();
        name = "Vegetarian Pizza Huixquilucan";
        dough = "Whole wheat dough";
        sauce = "Tomato sauce";
        ingredients.add("Bell peppers");
        ingredients.add("Onions");
        ingredients.add("Mushrooms");
        ingredients.add("Olives");
    }

    @Override
    public void cook() {
        System.out.println("Cooking vegetarian pizza at 450°F for 12 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting vegetarian pizza into 8 slices");
    }   
}
