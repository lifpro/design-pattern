package com.technolabista.builder;

/** "Director" */
class Cook
{
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pb)
    {
        pizzaBuilder = pb;
    }
    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
