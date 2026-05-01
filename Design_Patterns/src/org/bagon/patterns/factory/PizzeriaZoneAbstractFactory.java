package org.bagon.patterns.factory;

abstract public class PizzeriaZoneAbstractFactory {
    public ProductPizza orderPizza(String type) {
        ProductPizza pizza = createPizza(type); 

        System.out.println("Making the pizza " + pizza.getName());

        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.packUp();

        return pizza;
    }  

    abstract ProductPizza createPizza(String type);
}