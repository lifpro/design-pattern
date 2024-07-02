package com.technolabista.prototype;


public class Voiture {
    String name;
    String model;
    int nbRoues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    @Override
    public String toString() {
        return "Voiture {" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", nbRoues=" + nbRoues +
                '}';
    }
}
