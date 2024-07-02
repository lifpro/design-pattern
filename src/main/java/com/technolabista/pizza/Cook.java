package com.technolabista.pizza;
/*Director */
public class Cook {
    PizzaBuilder pb;

    public void setPb(PizzaBuilder pb) {
        this.pb = pb;
    }

    public Pizza getPizza(){
        return pb.getPizza();
    }
    public void createPizza(String type){
        this.pb.CreateNewPizzaProduct();
        this.pb.addPate();
        this.pb.addSauce();
        if(type.equals("complete")){
            this.pb.addGarniture();
            this.pb.addGarniture();
        }

    }
}
