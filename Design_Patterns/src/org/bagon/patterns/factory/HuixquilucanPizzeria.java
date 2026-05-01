package org.bagon.patterns.factory;

import org.bagon.patterns.factory.product.ItalianPizzaHuixquilucan;
import org.bagon.patterns.factory.product.PepperoniPizzaHuixquilucan;
import org.bagon.patterns.factory.product.VegetarianPizzaHuixquilucan;

public class HuixquilucanPizzeria extends PizzeriaZoneAbstractFactory {
    @Override
    ProductPizza createPizza(String type) {
        ProductPizza pizza = null;

        switch (type) {
            case "vegetarian":
                pizza = new VegetarianPizzaHuixquilucan();
                break;

            case "pepperoni":
                pizza = new PepperoniPizzaHuixquilucan();
                break;
            case "italian":
                pizza = new ItalianPizzaHuixquilucan();
                break;
        }

        return pizza;
    }
}
