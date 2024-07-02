package com.technolabista.prototype;

import com.technolabista.builder.*;

public class VoitureExample {
    public static void main(String[] args){
        Voiture v1=new Voiture();
        v1.setName("1.90");
        v1.setName("Merceses");
        v1.setNbRoues(4);


        Voiture v2=new Voiture();
        v2.setName(v1.getName());
        v2.setModel(v1.getModel());
        v2.setNbRoues(v1.getNbRoues());
        //v2.setNbRoues(2);
        //v2.setNbRoues(2);

        System.out.println("v1="+v1);
        System.out.println("v2="+v2);

    }
}
