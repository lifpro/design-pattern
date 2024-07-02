package com.technolabista.observer;

import java.util.*;
public abstract class Sujet {
    protected List<Observateur> observateurs = new ArrayList<Observateur>();
    public void ajoute(Observateur observateur) {

        observateurs.add(observateur);
    }
    public void retire(Observateur observateur) {
        observateurs.remove(observateur);
    }
    public void notifie() {
    }
}
