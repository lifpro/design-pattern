package com.technolabista.pizza;

public class RayanPizzaBuider extends PizzaBuilder{
    @Override
    public void addPate() {
        pizza.setPate("Mais");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Soga");
    }

    @Override
    public void addGarniture() {
        pizza.setGarniture("Olive");
    }
}
