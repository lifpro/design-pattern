package com.technolabista.pizza;

public class GuidosPizzaBuider  extends PizzaBuilder{
    @Override
    public void addPate() {
        pizza.setPate("Ble");
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Tomate");
    }

    @Override
    public void addGarniture() {
        pizza.setGarniture("Ananas");
    }
}
