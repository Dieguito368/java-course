package org.bagon.patterns.factory.product;

import org.bagon.patterns.factory.ProductPizza;

public class ItalianPizzaHuixquilucan extends ProductPizza {
    public ItalianPizzaHuixquilucan() {
        super();
        name = "Italian Pizza Huixquilucan";
        dough = "Thin crust dough";
        sauce = "Pomodoro sauce";
        ingredients.add("Fresh mozzarella");
        ingredients.add("Basil");
        ingredients.add("Cherry tomatoes");
        ingredients.add("Extra virgin olive oil");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Italian pizza in wood-fired oven at 500°F for 8 minutes");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Italian pizza into 6 slices");
    }   
}
