package com.technolabista.adapter;

public class DocumentExcel implements Document{
    protected String contenu;
    @Override
    public void setContenu(String contenu) {
        this.contenu=contenu;
    }

    @Override
    public void dessine() {
        System.out.println("Dessin du fichier excel");
    }

    @Override
    public void imprime() {
        System.out.println("Impression  du fichier excel");
    }
}
