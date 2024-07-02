package com.technolabista.pizza;

abstract public class PizzaBuilder {
    Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }
    public void CreateNewPizzaProduct(){
        this.pizza=new Pizza();
    }

    public abstract void addPate();
    public abstract void addSauce();
    public abstract void addGarniture();
}
