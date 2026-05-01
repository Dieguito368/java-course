package org.bagon.patterns.factory.product;

import org.bagon.patterns.factory.ProductPizza;

public class PepperoniPizzaHuixquilucan extends ProductPizza {
    public PepperoniPizzaHuixquilucan() {
        super();
        name = "Pepperoni Pizza Huixquilucan";
        dough = "Classic dough";
        sauce = "Tomato sauce";
        ingredients.add("Pepperoni");
        ingredients.add("Mozzarella cheese");
        ingredients.add("Olive oil");
        ingredients.add("Oregano");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pepperoni pizza at 425°F for 15 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pepperoni pizza into 8 slices");
    }   
}
