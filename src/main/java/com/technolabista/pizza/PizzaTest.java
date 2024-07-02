package com.technolabista.pizza;

public class PizzaTest {
    public static void main(String[] args){
        Cook cook=new Cook();
        GuidosPizzaBuider guidos=new GuidosPizzaBuider();
        RayanPizzaBuider  rayan=new RayanPizzaBuider();
        cook.setPb(guidos);
        cook.createPizza("complete");
        Pizza pg= cook.getPizza();
        System.out.println(" La pizza de guidos est composée de "+pg.toString());
        cook.setPb(rayan);
        cook.createPizza("simple");
        Pizza pr= cook.getPizza();
        System.out.println(" La pizza de rayan est composée de "+pr.toString());
    }
}
