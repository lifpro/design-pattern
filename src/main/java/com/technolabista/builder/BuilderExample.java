package com.technolabista.builder;

public class BuilderExample {
    public static void main(String[] args){
        Cook cook = new Cook();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        cook.setPizzaBuilder( hawaiianPizzaBuilder );
        cook.constructPizza();
        Pizza pizza = cook.getPizza();
        System.out.println(pizza.toString());
    }
}
