package com.technolabista.pizza;

public class Pizza {
    String pate="";
    String sauce="";
    String garniture="";


    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    @Override
    public String toString() {
        String r="";
        if(this.pate.length()>0) r+=" pate:"+this.pate;
        if(this.sauce.length()>0) r+=" sauce:"+this.sauce;
        if(this.garniture.length()>0) r+=" garniture:"+this.garniture;
        return r;
    }
}
